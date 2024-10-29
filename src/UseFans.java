/*
Robert Minkler
Oct 29, 2024
CSD 405 Module 2 Assignment

Use the Fan class, build a collections of fans, manipulate each fan and display fans
 */

/*
 * Create a collection of Fan instances.
 * Create a method taking a collection of Fan instances for displaying without using the toString() method.
 * Create a method that takes a single instance of a Fan for displaying without using the toString() method.
 * Use the this reference throughout the Fan class where allowed.
 * Write test code that creates a collection of Fans and displays the functionality of all of the Fan instances in the collection.
 */

import java.util.ArrayList;
import java.util.List;


public class UseFans {

    // How many fans will we add to the collection?
    private static final int numFans = 6;

    public static void main(String[] args) {

        // Create a collection of Fan instances
        List<Fan> fans = new ArrayList<>();

        // Add fans to the fans collection
        for (int i = 0; i < numFans; i++) {
            fans.add(new Fan());
        }

        // display the list of fans
        displayFans(fans);

        // FAN MANIPULATION BEGINS

        // turn the fans on
        for (Fan fan : fans) {
            fan.setOn(true);
        }

        // set the fan speed progressively increasing then restarting
        for (int i = 0; i < fans.size(); i++) {
            // % 4 keeps the speed between 0-3
            fans.get(i).setSpeed(i % 4);
        }

        // set the first half of the fans to Green
        for (int i = 0; i < (fans.size() / 2); i++) {
            fans.get(i).setColor("green");
        }

        // set every odd index fan radius to 10
        for (int i = 1; i < fans.size(); i += 2) {
            fans.get(i).setRadius(10);
        }

        // FAN MANIPULATION ENDS

        // display fans after manipulation.
        System.out.printf("%nFans after manipulation.%n");
        displayFans(fans);
    }

    public static void displayFans(List<Fan> fanList) {

        // Display all fans in the collection
        for (int i = 0; i < fanList.size(); i++) {
            System.out.print(i + ": ");
            System.out.println(displayFan(fanList.get(i)));
        }
    }

    public static String displayFan(Fan fan) {

        // Return the fan String
        return "{Fan: {on: " + fan.getOn() +
                ", speed: " + fan.getSpeedStr() +
                ", radius: " + fan.getRadius() +
                ", color: " + fan.getColor() + "}}";
    }
}