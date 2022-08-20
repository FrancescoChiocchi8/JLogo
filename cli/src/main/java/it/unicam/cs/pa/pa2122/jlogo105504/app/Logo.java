/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package it.unicam.cs.pa.pa2122.jlogo105504.app;

import it.unicam.cs.pa.pa2122.jlogo105504.api.io.FileProgramReader;
import it.unicam.cs.pa.pa2122.jlogo105504.api.io.FileProgramWriter;
import it.unicam.cs.pa.pa2122.jlogo105504.api.io.IFileProgramReader;
import it.unicam.cs.pa.pa2122.jlogo105504.api.io.IFileProgramWriter;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class represent the LOGO Application.
 */
public class Logo {

    public static void main(String[] args) throws IOException {
        new Logo().getAll();
    }

    /**
     * This provate method is used to get all information from the user.
     */
    private void getAll() throws IOException {
        File input = new Logo().getInputFile(new Scanner(System.in));
        File output = new Logo().getOutputFile(new Scanner(System.in));
        Integer width = new Logo().getWidthPanel(new Scanner(System.in));
        Integer height = new Logo().getHeightPanel(new Scanner(System.in));
        new Logo().run(input, output, width, height);
    }

    /**
     * This private method is the core of application; after take in input all parameters,
     * must read the
     *
     * @param input the file to read
     * @param output the file to write
     * @param width for the panel
     * @param height for the panel
     */
    private void run(File input, File output, Integer width, Integer height) throws IOException {
        //costruisco un nuovo panel con le dimensioni specificate dall'utente
        Panel panel = new SimplePanel(width, height);
        IFileProgramReader fileProgramReader = new FileProgramReader();
        fileProgramReader.readFile(input, panel);
        System.out.println("... Saving file: " + output.getName());
        SavingFile.saveProgramToFile(output,panel);
        System.out.println(panel.toString());
        System.out.println(panel.getCursor().getCurrentPosition().toString());
    }



    /**
     * This private method is used to get the input file from the user.
     *
     * @param scanner the scanner
     * @return the file take in input from the user
     */
    private File getInputFile(Scanner scanner){
        File file = null;
        while (file == null) {
            System.out.println("Insert Input File:");
            File inputFile = new File(scanner.nextLine());
            if (!inputFile.isFile() || !inputFile.exists() || !inputFile.canRead()) {
                System.out.println("Error!! File not found, try again.");
                continue;
            }
            file = inputFile;
        }
        return file;
    }

    /**
     * This private method is used to get the output file from the user.
     *
     * @param scanner used to take in input the file
     * @return the file
     */
    private File getOutputFile(Scanner scanner) {
        File file = null;
        while (file == null) {
            System.out.println("Insert Output File:");
            String outputFile = scanner.nextLine();
            File output = new File(outputFile);
            if (outputFile.trim().isEmpty()) continue;
            if (!output.exists())
                file = output;
            else System.out.println("Error!! File already exists, try again.");
        }
        return file;
    }

    /**
     * This private method is used to take in input the width of the panel specified from
     * the users.
     *
     * @param scanner used to take in input the width of the panel
     * @return the panel's width
     */
    private Integer getWidthPanel(Scanner scanner) {
        Integer width = null;
        while (width == null) {
            System.out.println("Insert Panel Width");
            Integer panelWidth = scanner.nextInt();
            if(panelWidth > 0)
                width = panelWidth;
            else System.out.println("Error!! The panel's width must be grater than 0, try again.");
        }
        return width;
    }

    /**
     * This private method is used to take in input the height of the panel specified from
     * the users.
     *
     * @param scanner used to take in input the height of the panel
     * @return the panel's height
     */
    private Integer getHeightPanel(Scanner scanner) {
        Integer height = null;
        while (height == null) {
            System.out.println("Insert Panel Height");
            Integer panelHeight = scanner.nextInt();
            if(panelHeight > 0)
                height = panelHeight;
            else System.out.println("Error!! The panel's height must be grater than 0, try again.");
        }
        return height;
    }
}
