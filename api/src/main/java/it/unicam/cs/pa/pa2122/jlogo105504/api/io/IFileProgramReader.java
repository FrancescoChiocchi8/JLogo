package it.unicam.cs.pa.pa2122.jlogo105504.api.io;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;

import java.io.File;
import java.io.IOException;

/**
 * This interface allows you to read a file with the Logo's instruction.
 *
 * @author Francesco Chiocchi
 */
public interface IFileProgramReader {

    /**
     * This method is used to read all instruction contained in the file.
     * @param file the file take in input
     * @param panel the panel
     */
    void readFile(File file, Panel panel) throws IOException;
}
