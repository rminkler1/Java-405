/*
Robert Minkler
Nov 1, 2024
CSD 405 Module 3 Assignment

Create and test RobertInteger class
 */

public class MinklerMod3 {
    public static void main(String[] args) {

        // Create three objects for testing
        RobertInteger robInt1 = new RobertInteger(5987);
        RobertInteger robInt2 = new RobertInteger(5987);
        RobertInteger robInt3 = new RobertInteger();    // using default constructor
        robInt3.setRobertInt(6000); // use setter for robInt3

        // Test object creation and setter
        System.out.println("*** TEST toString METHOD and confirm objects are created correctly ***");
        System.out.println("robInt1 values 5987: " + robInt1);
        System.out.println("robInt2 values 5987: " + robInt2);
        System.out.println("robInt3 values 6000: " + robInt3);
        System.out.println();

        // Test Getter
        System.out.println("*** TEST GETTER ***");
        System.out.println("get robInt1 value: " + robInt1.getRobertInt());
        System.out.println();

        // Test Equals
        System.out.println("*** TEST EQUALS METHODs ***");
        System.out.println("robInt1 equals robInt2: " + robInt1.equals(robInt2)); // true
        System.out.println("robInt2 equals robInt1: " + robInt2.equals(robInt1)); // true
        System.out.println("robInt2 equals robInt3: " + robInt2.equals(robInt3)); // false

        System.out.println("robInt3 equals int 6000: " + robInt3.equals(6000));     // true
        System.out.println("robInt3 equals int 6001: " + robInt3.equals(6001));     // false

        System.out.println("robInt3 equals Integer 6000: " + robInt3.equals(Integer.valueOf(6000)));    // true
        System.out.println("robInt3 equals Integer 6001: " + robInt3.equals(Integer.valueOf(60001)));   // false

        System.out.println();

        // Test isEven
        System.out.println("*** TEST isEven METHODs ***");
        System.out.println("robInt3.isEven (" + robInt3.getRobertInt() + "): " + robInt3.isEven());  // true
        System.out.println("robInt1.isEven (" + robInt1.getRobertInt() + "): " + robInt1.isEven());  // false

        System.out.println("static int isEven test 2: " + RobertInteger.isEven(2)); // true
        System.out.println("static int isEven test 3: " + RobertInteger.isEven(3)); // false

        System.out.println("static Integer isEven test 455: " + RobertInteger.isEven(Integer.valueOf(455)));    // false
        System.out.println("static Integer isEven test 456: " + RobertInteger.isEven(Integer.valueOf(456)));    // true
        System.out.println();

        // Test isOdd
        System.out.println("*** TEST isOdd METHODs ***");
        System.out.println("robInt3.isOdd (" + robInt3.getRobertInt() + "): " + robInt3.isOdd());  // false
        System.out.println("robInt1.isOdd (" + robInt1.getRobertInt() + "): " + robInt1.isOdd());  // true

        System.out.println("static int isOdd test 2: " + RobertInteger.isOdd(2)); // false
        System.out.println("static int isOdd test 3: " + RobertInteger.isOdd(3)); // true

        System.out.println("static Integer isOdd test 455: " + RobertInteger.isOdd(Integer.valueOf(455)));    // true
        System.out.println("static Integer isOdd test 456: " + RobertInteger.isOdd(Integer.valueOf(456)));    // false
        System.out.println();

        // Test isPrime
        System.out.println("*** TEST isPrime METHODs ***");
        System.out.println("robInt1 isPrime: (" + robInt1.getRobertInt() + "): " + robInt1.isPrime());    // true
        System.out.println("robInt2 isPrime: (" + robInt2.getRobertInt() + "): " + robInt2.isPrime());    // true
        System.out.println("robInt3 isPrime: (" + robInt3.getRobertInt() + "): " + robInt3.isPrime());    // false

        System.out.println("static int isPrime 2: " + RobertInteger.isPrime(2));    // true
        System.out.println("static int isPrime 4: " + RobertInteger.isPrime(4));    // false

        System.out.println("static Integer isPrime 5981: " + RobertInteger.isPrime(Integer.valueOf(5981))); // true
        System.out.println("static Integer isPrime 5980: " + RobertInteger.isPrime(Integer.valueOf(5980))); // false

        System.out.println();

        // Test numbers 0-50
        System.out.println("*** TEST numbers 0-50 ***");
        for (int i = 0; i <= 50; i++) {
            robInt3.setRobertInt(i);
            System.out.println(robInt3);
        }
    }
}

class RobertInteger {

    // Define parameters and set default value
    private int robertInt = 0;

    // Constructors
    RobertInteger() {
    }

    RobertInteger(int value) {
        robertInt = value;
    }

    // Getter and Setter
    public int getRobertInt() {
        return robertInt;
    }

    public void setRobertInt(int value) {
        robertInt = value;
    }

    // isEven static int with logic
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    // isEven static Integer
    public static boolean isEven(Integer value) {
        return isEven(value.intValue());
    }

    // isEven non-static
    public boolean isEven() {
        return isEven(robertInt);
    }

    // isOdd static int
    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    // isOdd static Integer
    public static boolean isOdd(Integer value) {
        return !isEven(value.intValue());
    }

    // isOdd non-static
    public boolean isOdd() {
        return !isEven(robertInt);
    }

    // isPrime static int with logic
    public static boolean isPrime(int value) {
        // Referenced https://www.geeksforgeeks.org/check-for-prime-number/ for formula
        // Anything below 2 cannot be prime
        if (value < 2) {
            return false;
        }

        // Iterate through all remaining numbers to see if the int is divisible by it.
        for (int i = 2; i <= Math.sqrt(value); i++) {

            // If we find a number that is divisible, then it is not prime
            if (value % i == 0) {
                return false;
            }
        }
        // It must be prime since we couldn't find any numbers to divide it by
        return true;
    }

    // isPrime static Integer
    public static boolean isPrime(Integer value) {
        return isPrime(value.intValue());
    }

    // isPrime non-static
    public boolean isPrime() {
        return isPrime(this.robertInt);
    }

    // equals int
    public boolean equals(int value) {
        return robertInt == value;
    }

    // equals Integer
    public boolean equals(Integer value) {
        return value.equals(robertInt);
    }

    // equals RobertInteger
    public boolean equals(RobertInteger value) {
        return getRobertInt() == value.getRobertInt();
    }

    public String toString() {
        return String.format("{%d: {isPrime:%b, isEven:%b, isOdd:%b}}",
                getRobertInt(), isPrime(), isEven(), isOdd()
        );
    }
}