package it.unicam.cs.pa.pa2122.jlogo105504.api.io;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;

import java.io.File;
import java.io.IOException;

/**
 * This class is used to write all information for this panel, included all characteristics
 * of the shapes and closed areas.
 *
 * @author Francesco Chiocchi
 */
public class SavingFile implements ISavingFile {

    @Override
    public void saveProgramToFile(File output, Panel panel) {
        try {
            IFileProgramWriter writer = new FileProgramWriter(output);
            writer.write(panel.toString());
        } catch (IOException e) {
            System.err.println("Input/Output error while writing the output file: " + e.getMessage());
        }
    }
}
