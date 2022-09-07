package it.unicam.cs.pa.pa2122.jlogo105504.api.io;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;

import java.io.File;

/**
 * This interface is used to save the program to the file.
 *
 * @author Francesco Chiocchi
 */
public interface ISavingFile {

    /**
     * This method is used to write the program to the file take in output.
     *
     * @param output the file to save the information of the panel and the shapes.
     * @param panel  the panel to examine
     */
    void saveProgramToFile(File output, Panel panel);
}
