package it.unicam.cs.pa.pa2122.jlogo105504.api.parser;

import it.unicam.cs.pa.pa2122.jlogo105504.api.antlr.CommandsBaseListener;
import it.unicam.cs.pa.pa2122.jlogo105504.api.antlr.CommandsParser;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import it.unicam.cs.pa.pa2122.jlogo105504.api.parser.exception.UnknownInstructionException;

import java.util.ArrayList;
import java.util.List;

/**
 * This class extends the class {@link CommandsBaseListener}, and has the responsibility
 * to recognize and implement the Logo's instructions.
 *
 * @author Francesco Chiocchi
 */
public class LogoBaseListener extends CommandsBaseListener {

    private final Panel panel;
    private Position startingPointPolygon;

    private final List<BasicShape> basicShapesList;
    private final List<ClosedArea> closedAreasList;
    /**
     * The idea is to create a "black list shapes" that are already part of a closed area,
     * so that it can no longer be part of a new closed area.
     */
    private final List<BasicShape> blackShapesList;

    private Position pointPenUp;

    /**
     * Associate panel for execute instruction.
     *
     * @param panel create by user
     */
    public LogoBaseListener(Panel panel) {
        this.panel = panel;
        startingPointPolygon = panel.getHome();
        basicShapesList = new ArrayList<>();
        closedAreasList = new ArrayList<>();
        blackShapesList = new ArrayList<>();
    }

   @Override
    public void enterSequenceInstruction(CommandsParser.SequenceInstructionContext ctx) {
        if(panel.getCursor().getPlot())
            startingPointPolygon = new Point(panel.getCursor().getCurrentPosition().getX(), panel.getCursor().getCurrentPosition().getY());
        List<CommandsParser.InstructionContext> instructions = ctx.instruction();
        recognizeInstruction(instructions);
    }

    /**
     * This method is used to recognize instructions.
     *
     * @param instructions the instructions to recognize
     */
    private void recognizeInstruction(List<CommandsParser.InstructionContext> instructions){
        for (CommandsParser.InstructionContext i : instructions) {
            if (i.getText().matches("(FORWARD|FD|forward|fd).*")) isAForwardInstruction(i);
            else if (i.getText().matches("(BACKWARD|BD|backward|bd).*")) isABackwardInstruction(i);
            else if (i.getText().matches("(LEFT|LF|left|lf).*")) isALeftInstruction(i);
            else if (i.getText().matches("(RIGHT|RT|right|rt).*")) isARightInstruction(i);
            else if (i.getText().matches("(CLEARSCREEN|CLS|clearscreen|cls).*")) isAClearScreenInstruction();
            else if (i.getText().matches("(HOME|HM|home|hm).*")) isAHomeInstruction();
            else if (i.getText().matches("(PENUP|PU|penup|pu).*")) isAPenUpInstruction();
            else if (i.getText().matches("(PENDOWN|PD|pendown|pd).*")) isAPenDownInstruction();
            else if (i.getText().matches("(SETPENCOLOR|SPC|setpencolor|spc).*")) isASetPenColorInstruction(i);
            else if (i.getText().matches("(SETFILLCOLOR|SFC|setfillcolor|sfc).*")) isASetFillColorInstruction(i);
            else if (i.getText().matches("(SETSCREENCOLOR|SSC|setscreencolor|ssc).*")) isASetScreenColorInstruction(i);
            else if (i.getText().matches("(SETPENSIZE|SPS|setpensize|sps).*")) isASetPenSizeInstruction(i);
            else if (i.getText().matches("(REPEAT|RP|repeat|rp).*")) isARepeatInstruction(i);
            else throw new UnknownInstructionException(i.getText());
        }
    }

    /**
     * This private method defines all operation to move forward the cursor in the panel, so
     * implement the Logo's instruction FORWARD.
     *
     * @param i the instruction
     */
    private void isAForwardInstruction(CommandsParser.InstructionContext i) {
        double distance = Double.parseDouble(i.forward().NUMBER().getText());
        Position beforeMoving = panel.getCursor().getCurrentPosition();
        panel.getCursor().setCurrentPosition(move(distance));
        checkAddLine(beforeMoving);
    }

    /**
     * This private method defines all operation to move backward the cursor in the panel, so
     * implement the Logo's instruction BACKWARD.
     *
     * @param i the instruction
     */
    private void isABackwardInstruction(CommandsParser.InstructionContext i) {
        double distance = Double.parseDouble(i.backward().NUMBER().getText());
        Position beforeMoving = panel.getCursor().getCurrentPosition();
        panel.getCursor().setCurrentPosition(move(-distance));
        checkAddLine(beforeMoving);
    }

    /**
     * This private method is used to move the cursor in the position specified into the file.
     *
     * @param distance which the cursor is to be moved
     * @return a new position after the moving.
     */
    private Position move(double distance) {
        double updateX = panel.getCursor().getCurrentPosition().getX() + (Math.cos(Math.toRadians(panel.getCursor().getDirection())) * distance);
        double updateY = panel.getCursor().getCurrentPosition().getY() + (Math.sin(Math.toRadians(panel.getCursor().getDirection())) * distance);
        if (updateX > panel.getWidth())
            updateX = panel.getWidth();
        if (updateY > panel.getHeight())
            updateY = panel.getHeight();
        return new Point(Math.round(updateX * 100.0) / 100.0, Math.round(updateY * 100.0) / 100.0);
    }

    /**
     * This private method check if the plot is true (so, the cursor is drawing), and id is true
     * was generated the line to be added to the panel, otherwise do nothing.
     *
     * @param beforeMoving the position before the moving
     */
    private void checkAddLine(Position beforeMoving) {
        Position afterMoving = panel.getCursor().getCurrentPosition();
        if (panel.getCursor().getPlot() && !beforeMoving.equals(afterMoving)) {
            BasicShape lastLineAdded = new Line(beforeMoving, afterMoving, panel.getCursor().getCurrentShapeColor(), panel.getCursor().getSizeLine());
            panel.getBasicShapes().add(lastLineAdded);
            basicShapesList.add(lastLineAdded);
            if(basicShapesList.size() > 2)
                checkIfIsAPolygon(lastLineAdded);
        }
    }

    /**
     * This private method check if the added shape generated a closed area, so a Polygon.
     *
     * @param lastLineAdded the last line added
     */
    private void checkIfIsAPolygon(BasicShape lastLineAdded) {
        if(startingPointPolygon.equals(lastLineAdded.getEnd()))
            if(closedAreasList.isEmpty())
                addPolygon();
            else
                checkLineOfPolygons();
    }

    /**
     * This private method check if the lines of the possible new polygon they already
     * make up another one.
     */
    private void checkLineOfPolygons() {
        for(BasicShape l : basicShapesList)
            if(blackShapesList.contains(l)){
                return;
            }
        addPolygon();
    }

    /**
     * Add the polygon to the lists and the black list of the shapes was updated.
     */
    public void addPolygon(){
        List<BasicShape> temporaryList = new ArrayList<>(basicShapesList);
        ClosedArea polygon = new Polygon(temporaryList, panel.getCursor().getCurrentFillColor());
        closedAreasList.add(polygon);
        panel.getClosedAreas().add(polygon);
        startingPointPolygon = panel.getCursor().getCurrentPosition();
        blackShapesList.addAll(basicShapesList);
        this.basicShapesList.clear();
    }

    /**
     * This private method change angle direction of the cursor to left, so implement the
     * Logo's instruction LEFT.
     *
     * @param i the instruction
     */
    private void isALeftInstruction(CommandsParser.InstructionContext i) {
        int direction = Integer.parseInt(i.left().NUMBER().getText());
        panel.getCursor().setDirection(direction);
    }

    /**
     * This private method change angle direction of the cursor to right, so implement
     * the Logo's instruction RIGHT.
     *
     * @param i the instruction
     */
    private void isARightInstruction(CommandsParser.InstructionContext i) {
        int direction = Integer.parseInt(i.right().NUMBER().getText());
        panel.getCursor().setDirection(-direction);
    }

    /**
     * This private method delete all shape in the panel, so implement the
     * Logo's instruction CLEARSCREEN.
     */
    private void isAClearScreenInstruction() {
        panel.getBasicShapes().clear();
    }

    /**
     * This private method set the current position to the home of the panel,
     * so implement the Logo's instruction HOME.
     * When the cursor moves in the home's position, a line is not generated.
     */
    private void isAHomeInstruction() {
        boolean wasDrawing = panel.getCursor().getPlot();
        panel.getCursor().setPlot(false);
        panel.getCursor().setCurrentPosition(panel.getHome());
        panel.getCursor().setPlot(wasDrawing);
    }

    /**
     * This private method set the plot of the cursor to false,  so implement the
     * Logo's instruction PENUP.
     */
    private void isAPenUpInstruction() {
        panel.getCursor().setPlot(false);
        this.pointPenUp = new Point(panel.getCursor().getCurrentPosition().getX(), panel.getCursor().getCurrentPosition().getY());
    }

    /**
     * This private method set the plot of the cursor to true, so implement the
     * Logo's instruction PENDOWN.
     */
    private void isAPenDownInstruction() {
        panel.getCursor().setPlot(true);
        if(pointPenUp.equals(new Point(panel.getCursor().getCurrentPosition().getX(), panel.getCursor().getCurrentPosition().getY())))
            return;
        this.basicShapesList.clear();
        startingPointPolygon = new Point(panel.getCursor().getCurrentPosition().getX(), panel.getCursor().getCurrentPosition().getY());
    }

    /**
     * This private method set the color of the pen to the cursor, so implement the
     * Logo's instruction SETPENCOLOR.
     *
     * @param i the instruction
     */
    private void isASetPenColorInstruction(CommandsParser.InstructionContext i) {
        int red = Integer.parseInt(i.setPenColor().NUMBER(0).getText());
        int green = Integer.parseInt(i.setPenColor().NUMBER(1).getText());
        int blue = Integer.parseInt(i.setPenColor().NUMBER(2).getText());
        panel.getCursor().setCurrentShapeColor(new RGBColor(red, green, blue));
    }

    /**
     * This private method set the color of a closed area in the panel, so implement the
     * Logo's instruction SETFILLCOLOR.
     *
     * @param i the instruction
     */
    private void isASetFillColorInstruction(CommandsParser.InstructionContext i) {
        int red = Integer.parseInt(i.setFillColor().NUMBER(0).getText());
        int green = Integer.parseInt(i.setFillColor().NUMBER(1).getText());
        int blue = Integer.parseInt(i.setFillColor().NUMBER(2).getText());
        panel.getCursor().setCurrentFillColor(new RGBColor(red, green, blue));
    }

    /**
     * This private method set the color of the screen in the panel, so implement the
     * Logo's instruction SETSCREENCOLOR.
     *
     * @param i the instruction
     */
    private void isASetScreenColorInstruction(CommandsParser.InstructionContext i) {
        int red = Integer.parseInt(i.setScreenColor().NUMBER(0).getText());
        int green = Integer.parseInt(i.setScreenColor().NUMBER(1).getText());
        int blue = Integer.parseInt(i.setScreenColor().NUMBER(2).getText());
        panel.setScreenColor(new RGBColor(red, green, blue));
    }

    /**
     * This private method is used to set the size's pen of the cursor, so implement
     * the Logo's instruction SETPENSIZE.
     *
     * @param i the instruction
     */
    private void isASetPenSizeInstruction(CommandsParser.InstructionContext i) {
        int penSize = Integer.parseInt(i.setPenSize().NUMBER().getText());
        panel.getCursor().setSizeLine(penSize);
    }

    /**
     * This private is used to repeat all instruction after the Logo's instruction REPEAT.
     *
     * @param i the instruction
     */
    private void isARepeatInstruction(CommandsParser.InstructionContext i) {
        int nRepeat = Integer.parseInt(i.repeat().NUMBER().getText());
        List<CommandsParser.InstructionContext> instructions = i.repeat().sequenceInstructionRepeat().instruction();
        for(int k = 0; k < nRepeat; k++)
            recognizeInstruction(instructions);
    }

}