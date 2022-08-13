package it.unicam.cs.pa.pa2122.jlogo105504.api.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class is an implementation of the interface {@link IFileProgramReader}.
 *
 * @author Francesco Chiocchi
 */
public class FileProgramReader implements IFileProgramReader {

    File fileInput;

    public FileProgramReader(File fileInput) {
        this.fileInput = fileInput;
    }

    @Override
    public String read() throws IOException {
        FileReader fileReader = new FileReader(fileInput);
        return null;
    }
}
