package it.unicam.cs.pa.pa2122.jlogo105504.api.parser;

import it.unicam.cs.pa.pa2122.jlogo105504.api.antlr.CommandsBaseListener;
import it.unicam.cs.pa.pa2122.jlogo105504.api.antlr.CommandsParser;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;

import java.util.List;

import static java.lang.Double.valueOf;

/**
 * This class extends the class {@link CommandsBaseListener}, and has the responsibility
 * to...
 *
 * @author Francesco Chiocchi
 */
public class LogoBaseListener extends CommandsBaseListener {

    private final Panel panel;

    /**
     * Associate panel for execute instruction.
     *
     * @param panel create by user
     */
    public LogoBaseListener(Panel panel) {
        this.panel = panel;
    }

    /**
     * This method is used to recognize instructions.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterSequenceInstruction(CommandsParser.SequenceInstructionContext ctx) {
        List<CommandsParser.InstructionContext> instructions = ctx.instruction();
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
            //TODO aggiungere default UnknownInstructionException
        }
    }

    /**
     * This private method defines all operation to move forward the cursor in the panel, so
     * implement the Logo's instruction FORWARD.
     *
     * @param i the instruction
     */
    private void isAForwardInstruction(CommandsParser.InstructionContext i) {
        double distance = valueOf(i.forward().NUMBER().getText());
        Position beforeMoving = panel.getCursor().getCurrentPosition();
        //TODO controllare se supera i bordi*/
        panel.getCursor().setCurrentPosition(move(distance));
        checkAddLine(beforeMoving);
        //TODO vedere se la linea generata crea un area chiusa --> se una sequenza di linee
        // partono e terminano nello stesso punto.
    }

    /**
     * This private method defines all operation to move backward the cursor in the panel, so
     * implement the Logo's instruction BACKWARD.
     *
     * @param i the instruction
     */
    private void isABackwardInstruction(CommandsParser.InstructionContext i) {
        double distance = valueOf(i.backward().NUMBER().getText());
        Position beforeMoving = panel.getCursor().getCurrentPosition();
        //TODO controllare se supera i bordi
        panel.getCursor().setCurrentPosition(move(-distance));
        checkAddLine(beforeMoving);
        //TODO vedere se la linea generata crea un area chiusa
    }

    /**
     * This private method is used to move the cursor in the position specified into the file.
     *
     * @param distance which the cursor is to be moved
     * @return a new position after the moving.
     */
    private Position move(double distance){
        double updateX = panel.getCursor().getCurrentPosition().getX() + (Math.cos(Math.toRadians(panel.getCursor().getDirection())) * distance);
        double updateY = panel.getCursor().getCurrentPosition().getY() - (Math.sin(Math.toRadians(panel.getCursor().getDirection())) * distance);
        if(updateX > panel.getWidth())
            updateX = panel.getWidth();
        if(updateY > panel.getHeight())
            updateY = panel.getHeight();
        return new Point(Math.round(updateX*100.0)/100.0, Math.round(updateY*100.0)/100.0);
    }

    /**
     * This private method check if the plot is true (so, the cursor is drawing), and id is true
     * was generated the line to be added to the panel, otherwise do nothing.
     *
     * @param beforeMoving the position before the moving
     */
    private void checkAddLine(Position beforeMoving){
        Position afterMoving = panel.getCursor().getCurrentPosition();
        if(panel.getCursor().getPlot() && !beforeMoving.equals(afterMoving)){
            Color color = panel.getCursor().getCurrentLineColor();
            int sizeLine = panel.getCursor().getSizeLine();
            panel.getShapes().add(new Line(beforeMoving, afterMoving, color, sizeLine));
            //TODO vedere se la linea generata crea un area chiusa
        }
    }

    /**
     * This private method change angle direction of the cursor to left, so implement the
     * Logo's instruction LEFT.
     *
     * @param i the instruction
     */
    private void isALeftInstruction(CommandsParser.InstructionContext i) {
        double direction = valueOf(i.left().NUMBER().getText());
        panel.getCursor().setDirection((int) direction);
    }

    /**
     * This private method change angle direction of the cursor to right, so implement
     * the Logo's instruction RIGHT.
     *
     * @param i the instruction
     */
    private void isARightInstruction(CommandsParser.InstructionContext i) {
        double direction = valueOf(i.right().NUMBER().getText());
        panel.getCursor().setDirection((int) direction);
        System.out.println("is a right instruction");
    }

    /**
     * This private method delete all shape in the panel, so implement the
     * Logo's instruction CLEARSCREEN.
     */
    private void isAClearScreenInstruction() {
        panel.getShapes().clear();
    }

    /**
     * This private method set the current position to the home of the panel,
     * so implement the Logo's instruction HOME.
     */
    private void isAHomeInstruction() {
        panel.getCursor().setCurrentPosition(panel.getHome());
    }

    /**
     * This private method set the plot of the cursor to false,  so implement the
     * Logo's instruction PENUP.
     */
    private void isAPenUpInstruction() {
        panel.getCursor().setPlot(false);
    }

    /**
     * This private method set the plot of the cursor to true, so implement the
     * Logo's instruction PENDOWN.
     */
    private void isAPenDownInstruction() {
        panel.getCursor().setPlot(true);
    }

    /**
     * This private method set the color of the pen to the cursor, so implement the
     * Logo's instruction SETPENCOLOR.
     *
     * @param i the instruction
     */
    private void isASetPenColorInstruction(CommandsParser.InstructionContext i) {
        panel.getCursor().setCurrentLineColor(getColor(i));
    }

    /**
     * This private method set the color of a closed area in the panel, so implement the
     * Logo's instruction SETFILLCOLOR.
     * @param i the instruction
     */
    private void isASetFillColorInstruction(CommandsParser.InstructionContext i) {
        //panel.getShapes().
        //TODO implementa metodo
    }

    /**
     * This private method set the color of the screen in the panel, so implement the
     * Logo's instruction SETSCREENCOLOR.
     * @param i the instruction
     */
    private void isASetScreenColorInstruction(CommandsParser.InstructionContext i) {
        panel.setScreenColor(getColor(i));
    }

    /**
     * This private method get the color into the file and is used to reduce duplicate code.
     *
     * @param i the instruction
     * @return the new RGBColor.
     */
    private Color getColor(CommandsParser.InstructionContext i) {
        double red = valueOf(i.setPenColor().NUMBER(0).getText());
        double green = valueOf(i.setPenColor().NUMBER(1).getText());
        double blue = valueOf(i.setPenColor().NUMBER(2).getText());
        return new RGBColor((int)red, (int)green, (int)blue);
    }

    /**
     * This private method is used to set the size's pen of the cursor, so implement
     * the Logo's instruction SETPENSIZE.
     * @param i the instruction
     */
    private void isASetPenSizeInstruction(CommandsParser.InstructionContext i) {
        double size = valueOf(i.setPenSize().NUMBER().getText());
        panel.getCursor().setSizeLine((int) size);
    }

    /**
     * This private is used to repeat all instruction after the Logo's instruction REPEAT.
     * @param i the instruction
     */
    private void isARepeatInstruction(CommandsParser.InstructionContext i) {
        System.out.println("is a repeat instruction");
    }

}