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
     * Create the simple panel for execute instruction.
     *
     * @param panel create by user
     */
    public LogoBaseListener(Panel panel) {
        this.panel = new SimplePanel(panel.getWidth(), panel.getHeight());
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
            else if (i.getText().matches("(CLEARSCREEN|CLS|clearscreen|cls).*")) isAClearScreenInstruction(i);
            else if (i.getText().matches("(HOME|HM|home|hm).*")) isAHomeInstruction(i);
            else if (i.getText().matches("(PENUP|PU|penup|pu).*")) isAPenUpInstruction(i);
            else if (i.getText().matches("(PENDOWN|PD|pendown|pd).*")) isAPenDownInstruction(i);
            else if (i.getText().matches("(SETPENCOLOR|SPC|setpencolor|spc).*")) isASetPenColorInstruction(i);
            else if (i.getText().matches("(SETFILLCOLOR|SFC|setfillcolor|sfc).*")) isASetFillColorInstruction(i);
            else if (i.getText().matches("(SETSCREENCOLOR|SSC|setscreencolor|ssc).*")) isASetScreenColorInstruction(i);
            else if (i.getText().matches("(SETPENSIZE|SPS|setpensize|sps).*")) isASetPenSizeInstruction(i);
            else if (i.getText().matches("(REPEAT|RP|repeat|rp).*")) isARepeatInstruction(i);

        }
    }

    /**
     * This private method move forward the cursor in the panel.
     *
     * @param i the instruction
     */
    private void isAForwardInstruction(CommandsParser.InstructionContext i) {
        Double distance = valueOf(i.forward().NUMBER().getText());
        Position beforeMoving = panel.getCursor().getCurrentPosition();
        double updateX = panel.getCursor().getCurrentPosition().getX() + (Math.cos(Math.toRadians(panel.getCursor().getDirection())) * distance);
        double updateY = panel.getCursor().getCurrentPosition().getY() + (Math.sin(Math.toRadians(panel.getCursor().getDirection())) * distance);
        System.out.println(updateX);
        System.out.println(updateY);
        panel.getCursor().setCurrentPosition(new Point(updateX, updateY));
        Position afterMoving = panel.getCursor().getCurrentPosition();
        Color color = panel.getCursor().getCurrentLineColor();
        int sizeLine = panel.getCursor().getSizeLine();
        //if(panel.getCursor().getPlot())
            Shape line = new Line(beforeMoving, afterMoving, color, sizeLine);
        System.out.println("is a moving instruction");
    }

    /**
     * This private method move backward the cursor in the panel.
     *
     * @param i the instruction
     */
    private void isABackwardInstruction(CommandsParser.InstructionContext i) {
        System.out.println("is a backward instruction");
    }

    /**
     * This private method change angle direction of the cursor to left.
     *
     * @param i the instruction
     */
    private void isALeftInstruction(CommandsParser.InstructionContext i) {
        double direction = valueOf(i.left().NUMBER().getText());
        panel.getCursor().setDirection((int) direction);
        System.out.println("The change direction of the cursor is updated to: " + panel.getCursor().getDirection());
    }

    /**
     * This private method change angle direction of the cursor to right.
     *
     * @param i the instruction
     */
    private void isARightInstruction(CommandsParser.InstructionContext i) {
        System.out.println("is a right instruction");
    }

    private void isAClearScreenInstruction(CommandsParser.InstructionContext i) {
        System.out.println("is a clear screen instruction");
    }

    private void isAHomeInstruction(CommandsParser.InstructionContext i) {
        System.out.println("is a home instruction");
    }

    private void isAPenUpInstruction(CommandsParser.InstructionContext i) {
        System.out.println("is a pen up instruction");
    }

    private void isAPenDownInstruction(CommandsParser.InstructionContext i) {
        System.out.println("is a pen down instruction");
    }

    private void isASetPenColorInstruction(CommandsParser.InstructionContext i) {
        System.out.println("is a set pen color instruction");
    }

    private void isASetFillColorInstruction(CommandsParser.InstructionContext i) {
        System.out.println("is a set fill color instruction");
    }

    private void isASetScreenColorInstruction(CommandsParser.InstructionContext i) {
        System.out.println("is a set screen color instruction");
    }

    private void isASetPenSizeInstruction(CommandsParser.InstructionContext i) {
        System.out.println("is a set pen size instruction");
    }

    private void isARepeatInstruction(CommandsParser.InstructionContext i) {
        System.out.println("is a repeat instruction");
    }

}