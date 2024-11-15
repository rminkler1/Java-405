/*
Robert Minkler
Nov 14, 2024
CSD 405 Module 5 Assignment #2

Write random numbers to a file then read them back
 */

import java.io.*;
import java.util.Scanner;

public class MinklerMod5_2 {
    public static void main(String[] args) {

        // Create File object, PrintWriter, and Scanner
        File file = new File("data.file");
        PrintWriter pw;
        Scanner input;

        try {
            // Create a new file on disk if it does not exist
            boolean created = file.createNewFile();

            // Give user status if new file was created
            if (created)
                System.out.println("java.file created successfully at: " + file.getAbsolutePath());

            // Give the user feedback
            System.out.println("Writing to file " + file.getAbsolutePath());

            // Initialize PrintWriter to append
            pw = new PrintWriter(new FileOutputStream(file, true));

            // Write 10 random ints to the file
            for (int i = 0; i < 10; i++) {
                pw.print((int) (Math.random() * 1000) + " ");
            }

            // Create a line break so the next write appears on a different line
            pw.println();

            // close up the PrintWriter
            pw.flush();
            pw.close();

            // Inform the user of progress
            System.out.println("data.file written to successfully.");

        } catch (IOException | SecurityException ex) {
            // Handle exceptions. End program if unable to create a writable file.
            System.out.println("Permission Denied: Unable to create the file.");
            System.exit(1);
        }

        // Give the user feedback
        System.out.println("Reading data.file contents back...");

        // Reopen the file and read the contents
        try {
            input = new Scanner(file);

            // Read each entry from the file and print it to the console
            while (input.hasNext()) {
                System.out.println(input.next());
            }

            input.close();

        } catch (IOException ex) {
            // Display exception if file cannot be found
            System.out.println("File Not Found Exception.");
        }

        // Final user status message
        System.out.println("Program complete. Goodbye.");
    }
}

/*
Program 2: Write a program to create a new file titled data.file, if the file does not exist.
Then write to the new file, adding 10 randomly generated numbers,
or append 10 randomly generated numbers to a previous file.
Each integer is to be separated by a space.
Close the file, then reopen the file and read the data from the file and display it.
 */