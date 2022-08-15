package it.unicam.cs.pa.pa2122.jlogo105504.api.parser;

import it.unicam.cs.pa.pa2122.jlogo105504.api.antlr.CommandsBaseListener;
import it.unicam.cs.pa.pa2122.jlogo105504.api.antlr.CommandsParser;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;

import java.util.List;

/**
 * This class extends the class {@link CommandsBaseListener}, and has the responsibility
 * to...
 *
 * @author Francesco Chiocchi
 */
public class LogoBaseListener extends CommandsBaseListener {

    private Panel panel;

    /**
     * Create the simple panel for execute instruction.
     * @param panel create by user
     */
    public LogoBaseListener(Panel panel) {
        this.panel = new SimplePanel(panel.getWidth(), panel.getHeight());
    }

    /**
     * This method is used to recognize instructions.
     * @param ctx the parse tree
     */
    @Override public void enterSequenceInstruction(CommandsParser.SequenceInstructionContext ctx) {
        List<CommandsParser.InstructionContext> instructions = ctx.instruction();
        for(CommandsParser.InstructionContext i : instructions ){
            if(i.forward().getText().equals("FORWARD") || i.backward().getText().equals("BACKWARD"))
                isAMovingInstruction(i);
            else if(i.left().getText().equals("LEFT") || i.right().getText().equals("RIGHT"))
                isADirectionInstruction(i);
            else if(i.clearScreen().getText().equals("CLEARSCREEN"))
                isAClearScreenInstruction(i);
            else if(i.home().getText().equals("HOME"))
                isAHomeInstruction(i);
            else if(i.penUp().getText().equals("PENUP") || i.penDown().getText().equals("PENDOWN") || i.setPenSize().getText().equals("SETPENSIZE"))
                isAPenInstruction(i);
            else if(i.setPenColor().getText().equals("SETPENCOLOR") || i.setFillColor().getText().equals("SETFILLCOLOR") || i.setScreenColor().getText().equals("SETSCREENCOLOR"))
                isAColorInstruction(i);
            else try {
                    throw new UnknownInstructionException(i.getText());
                } catch (UnknownInstructionException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    /**
     * This private method move forward or backward the cursor in the panel.
     *
     * @param i the instruction
     */
    private void isAMovingInstruction(CommandsParser.InstructionContext i){
        Double distance = Double.valueOf(i.forward().NUMBER().getText());
        System.out.println("is a moving instruction");
        //panel.getCursor().move(distance);
    }

    /**
     * This private method change direction to the cursor in the panel.
     *
     * @param i the instruction
     */
    private void isADirectionInstruction(CommandsParser.InstructionContext i) {
        System.out.println("is a changing direction instruction");
    }

    private void isAClearScreenInstruction(CommandsParser.InstructionContext i) {

    }

    private void isAHomeInstruction(CommandsParser.InstructionContext i) {

    }

    private void isAPenInstruction(CommandsParser.InstructionContext i) {

    }
    private void isAColorInstruction(CommandsParser.InstructionContext i) {
    }
}