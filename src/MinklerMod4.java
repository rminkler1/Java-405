/*
    Robert Minkler
    Nov 8, 2024
    CSD 405 Module 4 Assignment

    Build an ArrayList from user input.
    Find the largest number entered.
    Use 0 as a sentinel.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class MinklerMod4 {
    public static void main(String[] args) {

        // Prompt the user
        System.out.println("""
                FIND THE LARGEST NUMBER
                Enter whole numbers separated by a space or new line.
                When all number have been entered, enter "0".
                The largest number entered will be returned, excluding the zero.""");

        // Get Integers from user input and add them to the ArrayList
        ArrayList<Integer> listOfInt = RobertArrayListTest.getUserInput();

        // Display the Array
        System.out.println("The Array Built from user entry: " + listOfInt);

        // Find the largest number and display it
        System.out.println("The largest number entered: " + RobertArrayListTest.max(listOfInt));

        // Run additional tests
        RobertArrayListTest.tests();
    }
}


class RobertArrayListTest {

    public static ArrayList<Integer> getUserInput() {
        // Accepts user input of int and assigns them to an array until 0 is entered.

        // Initialize Scanner and Empty ArrayList
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();

        // Get next int from user and fill the ArrayList
        do {
            intList.add(input.nextInt());
        } while (!intList.getLast().equals(0));     // Stop when zero is entered

        return intList;
    }

    public static Integer max(ArrayList list) {
        // Set local variable to hold the largest Integer and current
        Integer largestInt;
        Integer currentInt;

        // Verify the first value in the list exists and is an Integer
        // Set largest to the first value in the list
        if (list.size() > 1 && list.getFirst() instanceof Integer) {
            largestInt = (Integer) list.getFirst();
        } else {
            // returns 0 if list is empty or the first object is not an Integer
            return 0;
        }

        // Iterate over remaining Objects
        for (int i = 1; i < list.size() - 1; i++) {

            // get next item
            currentInt = (Integer) list.get(i);

            // If the next item is an Integer greater than the largest seen, store it.
            if (list.get(i) instanceof Integer && currentInt.compareTo(largestInt) > 0) {
                largestInt = currentInt;
            }
        }
        return largestInt;
    }

    public static void tests() {

        // Initialize test array
        ArrayList<Integer> listOfInt = new ArrayList<>();

        // Run additional tests
        System.out.println();
        System.out.println("Run additional tests:");

        // TEST 1 All negative numbers
        System.out.println();
        System.out.println("TEST 1 All negative numbers:");

        listOfInt.add(-101);
        listOfInt.add(-10);
        listOfInt.add(-19);
        listOfInt.add(0);   // sentinel
        System.out.println("The test ArrayList: " + listOfInt);
        System.out.println("Largest number returned: " + RobertArrayListTest.max(listOfInt));

        // TEST 2 Check first number as largest
        System.out.println();
        System.out.println("TEST 2 Check first number as largest:");

        listOfInt.clear();
        listOfInt.add(101000);
        listOfInt.add(100);
        listOfInt.add(1000);
        listOfInt.add(0);   // sentinel
        System.out.println("The test ArrayList: " + listOfInt);
        System.out.println("Largest number returned: " + RobertArrayListTest.max(listOfInt));

        // TEST 3 Check last number as largest
        System.out.println();
        System.out.println("TEST 3 Check last number as largest:");

        listOfInt.clear();
        listOfInt.add(10);
        listOfInt.add(10);
        listOfInt.add(19876);
        listOfInt.add(0);   // sentinel
        System.out.println("The test ArrayList: " + listOfInt);
        System.out.println("Largest number returned: " + RobertArrayListTest.max(listOfInt));


        // TEST 4 Check Empty list with sentinel
        System.out.println();
        System.out.println("TEST 4 Check empty list with 0 sentinel:");

        listOfInt.clear();
        listOfInt.add(0);   // sentinel

        System.out.println("The test ArrayList: " + listOfInt);
        System.out.println("Largest number returned: " + RobertArrayListTest.max(listOfInt));

        // TEST 5 Check Empty list with no sentinel
        System.out.println();
        System.out.println("TEST 5 Check empty list with no sentinel:");

        listOfInt.clear();

        System.out.println("The test ArrayList: " + listOfInt);
        System.out.println("Largest number returned: " + RobertArrayListTest.max(listOfInt));

        // TEST 6 Check Single item list
        System.out.println();
        System.out.println("TEST 6 Check single item list:");

        listOfInt.clear();
        listOfInt.add(-300);
        listOfInt.add(0);   // sentinel

        System.out.println("The test ArrayList: " + listOfInt);
        System.out.println("Largest number returned: " + RobertArrayListTest.max(listOfInt));
    }
}