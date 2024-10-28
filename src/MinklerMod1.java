/*
Robert Minkler
Oct 26, 2024
CSD 405 Module 1 Assignment

Create a fan class and demonstrate it in use.
This file demonstrates it in use.
 */

public class MinklerMod1 {
    public static void main(String[] args) {

        // Build two fans
        Fan firstFan = new Fan();

        Fan secondFan = new Fan(Fan.MEDIUM, true, 15, "blue");

        // Fan 1 manipulation
        System.out.println("firstFan on creation.");
        System.out.println(firstFan);

        firstFan.setSpeed(Fan.FAST);
        firstFan.setColor("green");
        firstFan.setRadius(8);
        firstFan.setOn(true);

        System.out.println("firstFan after first manipulation.");
        System.out.println(firstFan);

        firstFan.speedDown();   // to MEDIUM
        firstFan.speedDown();   // to SLOW

        System.out.println("firstFan after second manipulation.");
        System.out.println(firstFan);
        // End Fan 1 manipulation

        System.out.println();

        // Fan 2 manipulation
        System.out.println("secondFan on creation.");
        System.out.println(secondFan);

        secondFan.setColor("amber");
        secondFan.setRadius(10);
        secondFan.setSpeed(Fan.SLOW);
        secondFan.setOn(false);

        System.out.println("secondFan after first manipulation.");
        System.out.println(secondFan);

        secondFan.speedUp();    // to MEDIUM
        secondFan.speedUp();    // to FAST
        secondFan.speedUp();    // does nothing because we are already FAST
        secondFan.powerSwitch();    // turns fan on since it was off

        System.out.println("secondFan after second manipulation.");
        System.out.println(secondFan);
        // End Fan 2 manipulation
    }
}
