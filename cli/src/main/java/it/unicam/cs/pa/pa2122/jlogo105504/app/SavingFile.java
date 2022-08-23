package it.unicam.cs.pa.pa2122.jlogo105504.app;

import it.unicam.cs.pa.pa2122.jlogo105504.api.io.FileProgramWriter;
import it.unicam.cs.pa.pa2122.jlogo105504.api.io.IFileProgramWriter;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;

import java.io.File;
import java.io.IOException;

/**
 * This class is used to write all information for this panel, included all characteristics
 * of the shapes and closed areas.
 *
 * @author Francesco Chiocchi
 */
public class SavingFile {

    /**
     * This static method is used to write the program to the file take in output.
     *
     * @param output the file to save the information of the panel and the shapes.
     * @param panel the panel to examine
     * @return true if everything went well, false otherwise.
     */
    public static boolean saveProgramToFile(File output, Panel panel) {
        try {
            IFileProgramWriter writer = new FileProgramWriter(output);
            writer.write(panel.toString());
            return true;
        } catch (IOException e) {
            System.err.println("Input/Output error while writing the output file: " + e.getMessage());
            return false;
        }
    }
}
