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

    // Constants
    private static final int NUM_FANS = 6;
    private static final int[] FAN_SPEED = {Fan.STOPPED, Fan.SLOW, Fan.MEDIUM, Fan.FAST};
    private static final String[] COLORS = {"green", "blue"};
    private static final int NEW_RADIUS = 10;

    public static void main(String[] args) {

        // Create a collection of Fan instances
        List<Fan> fans = new ArrayList<>();

        // Add fans to the fans collection
        for (int i = 0; i < NUM_FANS; i++) {
            fans.add(new Fan());
        }

        // display the list of fans
        System.out.println("Fans after creation with default values.");
        displayFans(fans);

        // FAN MANIPULATION BEGINS

        // turn the fans on
        for (Fan fan : fans) {
            fan.setOn(true);
        }

        // set the fan speed progressively increasing then restarting
        for (int i = 0; i < fans.size(); i++) {
            // [i % FAN_SPEED.length] keeps the speed between all valid speed variables
            fans.get(i).setSpeed(FAN_SPEED[i % FAN_SPEED.length]);
        }

        // set the first half of the fans to COLORS[0]
        for (int i = 0; i < (fans.size() / 2); i++) {
            fans.get(i).setColor(COLORS[0]);
        }

        // set the second half of the fans to COLORS[1]
        for (int i = fans.size() / 2; i < fans.size(); i++) {
            fans.get(i).setColor(COLORS[1]);
        }

        // set every odd index fan radius to NEW_RADIUS
        for (int i = 1; i < fans.size(); i += 2) {
            fans.get(i).setRadius(NEW_RADIUS);
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