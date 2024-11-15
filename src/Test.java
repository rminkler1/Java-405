import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.add("hello");
        stack.add("world");
        System.out.println("Stack: " + stack);
        System.out.println("Pop item: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        try {
            ArrayStack newStack = ((ArrayStack) stack).clone();
            newStack.add("NewItem");

            System.out.println("Original Stack\t" + stack);
            System.out.println("New Stack:\t" + newStack);
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }


        CalendarTest.buildCalendar();
        CopyObject.copyObject();

        // Declare numbers to use
        int[] numArray = {0, 100, 50, -1, 200, 3};

        // Test each number
        for (int percent : numArray) {
            try {
                // Try this code
                System.out.println(percent + "% converted to 256 bit: " + convPercentTo256(percent));
            } catch (InvalidPercentageException ex) {
                // Handle the exception if it occurs as I deem best for this application.
                System.out.println("Exception caught. " + ex);
            } finally {
                System.out.println("Try was tried.");
            }
        }
    }

    public static int getInt() throws InvalidPercentageException {
        Scanner input = new Scanner(System.in);

        int getUserInput = input.nextInt();

        if (true) {
            throw new InvalidPercentageException(getUserInput);
        } else {
            return getUserInput;
        }
    }


    public static int convPercentTo256(double percentage)
            throws InvalidPercentageException {

        // Check for valid input
        if (percentage < 0 || percentage > 100) {
            // throw an exception to be handled by the calling method
            throw new InvalidPercentageException(percentage);
        } else {
            // Convert % to 256-bit int and return it
            return (int) (percentage * 2.55 + .5);
        }
    }
}

class CalendarTest {

    public static void buildCalendar() {
        // creates a GregorianCalendar object
        Calendar calendar = new GregorianCalendar();

        // get month day and year from calendar object
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.YEAR);

        // output results
        System.out.println("Today's date is " + month + "/" + day + "/" + year);
    }
}

class CopyObject {
    public static void copyObject() {

        Animal obj = new Animal("cat");  // Create Animal object
        Animal obj2 = obj;          // assign Animal object to obj2. Does not create a clone.
        Animal obj3 = null;         // Initialize obj3 for later cloning.

        try {
            obj3 = (Animal) obj.clone();    // use the clone method to clone the animal
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Sets obj and obj2 to "Elephant" because they both point to the same object
        obj2.setType("Elephant");

        // Display results
        System.out.println("obj: " + obj);
        System.out.println("obj2: " + obj2);
        System.out.println("obj3: " + obj3);

    }
}

class Animal implements Cloneable {
    private String type;

    Animal() {
        this.type = "Generic Animal";
    }

    Animal(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class ArrayStack implements Cloneable {
    private ArrayList<String> stack = new ArrayList<>();

    ArrayStack() {
    }

    public void add(String obj) {
        stack.add(obj);
    }

    public String pop() {
        String popEdObject = stack.getLast();
        stack.removeLast();
        return popEdObject;
    }

    public String toString() {
        return stack.toString();
    }

    @Override
    public ArrayStack clone() throws CloneNotSupportedException {
        ArrayStack copy = null;

        copy = (ArrayStack) super.clone();
        copy.stack = (ArrayList<String>) stack.clone();
        // copy the items from the arrayList over to the new arrayList
        for (String item : this.stack) {
            copy.add(item);
        }

        return copy;
    }
}