package it.unicam.cs.pa.pa2122.jlogo105504.api.io;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This interface allows you to read a file with the logo's information.
 *
 * @author Francesco Chiocchi
 */
public interface IFileProgramReader {

    /**
     * This method is used to read all instruction contained in the file.
     *
     * @return a string that represent all instruction to be executed
     */
    String read() throws IOException;
}
