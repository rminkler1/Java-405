/*
Robert Minkler
Nov 14, 2024
CSD 405 Module 5 Assignment #1

Access items in an ArrayList
 */


import java.util.*;

public class MinklerMod5_1 {

    public static void main(String[] args) {

        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Build an Array of 10 strings
        String[] arrayOfStrings = {"Hello", "World", "Welcome", "To", "Robert's", "Module",
                "Five", "Assignment", "Number", "one"};

        // Add the Strings to an ArrayList
        ArrayList<String> listOfStrings = new ArrayList<>();
        Collections.addAll(listOfStrings, arrayOfStrings);

        // Use for-each loop to print the ArrayList collection
        printArray(listOfStrings);

        // prompt User
        System.out.println("\nWhich item would you like to see again? Enter the corresponding number. ");

        // set variables for use in next steps
        // Use Integer to force Autoboxing and Unboxing
        Integer userChoice = -1;
        String selection = null;

        do {
            try {
                // get user input then use it to get the corresponding item.
                // use Autoboxing to turn the int into an Integer
                userChoice = input.nextInt();
                selection = listOfStrings.get(userChoice);

            } catch (IndexOutOfBoundsException ex) {
                // Catch numbers out of bounds
                System.out.println("Out of Bounds: Enter a number between 0 and " +
                        (listOfStrings.size() - 1) +
                        ". Try Again.");

                printArray(listOfStrings);

            } catch (InputMismatchException ex) {
                // Catch other invalid input
                System.out.println("Invalid Entry: Enter a number between 0 and " +
                        (listOfStrings.size() - 1) +
                        ". Try Again.");

                printArray(listOfStrings);
                input.next();   // move scanner beyond bad entry
            }
        } while (userChoice < 0 || userChoice > listOfStrings.size() - 1);  // Continue Prompting until entry is valid.

        // Print user's choice
        System.out.println("You selected " + userChoice + ": " + selection);
    }

    private static void printArray(ArrayList<String> arrayOfStrings) {
        int i = 0; // block level iterator

        // Print each element in the ArrayList and advance iterator
        for (String word : arrayOfStrings)
            System.out.println(i++ + ": " + word);
    }
}

/*
Program 1: Write a program that uses an ArrayList filled with a minimum of 10 Strings.
Use a ‘for-each’ loop to print the ArrayList collection.
Then ask a user which element they would like to see again.
Then, attempt printing the element in a try/catch format which will result in the element being displayed.
If the element value received is invalid, display a message that an Exception has been thrown displaying “Out of Bounds”.
In this program, include the use of Autoboxing/Auto-Unboxing, working with a user String input.
 */