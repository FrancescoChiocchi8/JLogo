package it.unicam.cs.pa.pa2122.jlogo105504.app;

import it.unicam.cs.pa.pa2122.jlogo105504.api.io.FileProgramWriter;
import it.unicam.cs.pa.pa2122.jlogo105504.api.io.IFileProgramReader;
import it.unicam.cs.pa.pa2122.jlogo105504.api.io.IFileProgramWriter;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;

import java.io.File;
import java.io.IOException;

/**
 * @author Francesco Chiocchi
 */
public class SavingFile {

    public static boolean saveProgramToFile(File output, Panel panel) {
        try {
            IFileProgramWriter writer = new FileProgramWriter(output);
            writer.write(panel.toString());
            return true;
        } catch (IOException e) {
            System.err.println("I/O error while writing the output file: " + e.getMessage());
            return false;
        }
    }
}
