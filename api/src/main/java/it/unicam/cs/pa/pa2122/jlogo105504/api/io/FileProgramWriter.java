package it.unicam.cs.pa.pa2122.jlogo105504.api.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class is an implementation of the interface {@link IFileProgramWriter}.
 * @author Francesco Chiocchi
 */
public class FileProgramWriter implements IFileProgramWriter {

    File fileOutput;

    public FileProgramWriter(File fileOutput) {
        this.fileOutput = fileOutput;
    }

    @Override
    public void write(String program) throws IOException {
        if (!fileOutput.createNewFile() && !fileOutput.exists() && !fileOutput.canWrite())
            throw new IOException("Cannot write to file " + fileOutput.getAbsolutePath());
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileOutput));
        writer.write(program);
        writer.close();
    }
}
