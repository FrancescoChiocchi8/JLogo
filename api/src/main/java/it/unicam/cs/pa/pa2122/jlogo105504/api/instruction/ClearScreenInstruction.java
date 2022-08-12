package it.unicam.cs.pa.pa2122.jlogo105504.api.instruction;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;

/**
 * @author Francesco Chiocchi
 */
public class ClearScreenInstruction {
    Panel panel;

    public ClearScreenInstruction(){
        panel.getLines().clear();
    }
}
