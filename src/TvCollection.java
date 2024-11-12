import java.util.*;

public class TvCollection {

    public static void main(String[] args) {

        // Create a Tv array with five places for a tv
        Tv[] tvArray = new Tv[5];

        // Fill the array with Tv objects
        for (int i = 0; i < tvArray.length; i++) {
            tvArray[i] = new Tv();
        }
        // Print the tvArray
        System.out.println(Arrays.toString(tvArray));


        // Lists are a dynamically sized collection and can be added to after creation
        // Create a new tvList collection
        List<Tv> tvList = new ArrayList<>();

        // Add four TVs to the list
        for (int i = 0; i < 4; i++) {
            tvList.add(new Tv());
        }
        // Print the TV list
        System.out.println(tvList);


        // Now I can iterate through the collection and turn them all on
        // then change their channel to a random channel between 1 & 15
        for (Tv tv : tvList) {
            tv.powerOn();
            tv.setChannel((int) (Math.random() * 15 + 1));
        }
        // Print the TV list
        System.out.println(tvList);
    }
}