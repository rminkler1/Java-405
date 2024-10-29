/*
Robert Minkler
Oct 29, 2024
CSD 405 Module 2 Assignment

Use UseFans.displayFan where possible in Fan class
replaced toString method with output from displayFan
 */

public class Fan {
    // DEFINE CONSTANTS. Make public for external reference.
    public final static int STOPPED = 0;
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;

    // Track fan settings. Defaults set in constructor
    private int speed;
    private boolean on;
    private int radius;
    private String color;

    // No Argument Constructor with default settings
    Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Constructor with arguments
    Fan(int speed, boolean on, int radius, String color) {

        // Use Setters for Validation
        setSpeed(speed);
        setRadius(radius);

        // set remaining parameters
        this.on = on;
        this.color = color;
    }

    // Setters and Getters
    public String getSpeedStr() {
        // Return the speed as a String
        return switch (speed) {
            case STOPPED -> "STOPPED";
            case SLOW -> "SLOW";
            case MEDIUM -> "MEDIUM";
            case FAST -> "FAST";
            default -> throw new IllegalStateException("Unexpected Fan speed: " + speed);
        };
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        // only set the speed if the argument is within spec
        switch (speed) {
            case STOPPED, SLOW, MEDIUM, FAST:
                this.speed = speed;
                break;
            default:
                throw new IllegalArgumentException(
                        "Speed is not valid. Use Fan.STOPPED, Fan.SLOW, Fan.MEDIUM, or Fan.FAST."
                );
        }
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius is not valid. radius must be a positive int.");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Show status using toString
    // Use displayFan method in UseFan Class for output
    public String toString() {
        return UseFans.displayFan(this);
    }

    // additional functionality not required in the spec.

    // Power switch
    public void powerSwitch() {
        on = !on;
    }

    // Speed Up
    public void speedUp() {
        if (speed < FAST) {
            speed += 1;
        }
    }

    // Speed Down
    public void speedDown() {
        if (speed > STOPPED) {
            speed -= 1;
        }
    }
}
