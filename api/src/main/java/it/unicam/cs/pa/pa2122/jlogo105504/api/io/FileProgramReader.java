package it.unicam.cs.pa.pa2122.jlogo105504.api.io;

import java.io.BufferedReader;
import java.io.File;
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
        StringBuilder program = new StringBuilder();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileInput));
            while ((line = reader.readLine()) != null){
                program.append(line);
                program.append("\n");
            }
        }
        catch (IOException e){
            System.out.println("Error while reading the file!!");
        }
        return program.toString();
    }
}
