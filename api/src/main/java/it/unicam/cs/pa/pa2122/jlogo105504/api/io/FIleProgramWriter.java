package it.unicam.cs.pa.pa2122.jlogo105504.api.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class is an implementation of the interface {@link IFileProgramWriter}.
 * @author Francesco Chiocchi
 */
public class FIleProgramWriter implements IFileProgramWriter {

    File fileOutput;

    public FIleProgramWriter(File fileOutput) {
        this.fileOutput = fileOutput;
    }

    @Override
    public void write(String program) throws IOException {
        FileWriter fileWriter = new FileWriter(fileOutput);
    }
}
