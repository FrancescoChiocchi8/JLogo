package it.unicam.cs.pa.pa2122.jlogo105504.api.io;

import java.io.IOException;

/**
 * This interface allows you to create and write about a new file.
 *
 * @author Francesco Chiocchi
 */
public interface IFileProgramWriter {

    /**
     * This method is used to create and write a new file that has all the necessary information
     * after reading a file.
     *
     * @param program to write
     */
    void write(String program) throws IOException;
}
