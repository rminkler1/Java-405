import java.util.HashMap;

public class Test {
    public static void main(String[] args) {

        // Initialize the string and an empty HashMap
        String word = "supercalifragilisticexpialidocious";
        HashMap<String, Integer> storedChar = new HashMap<>();

        // loop through each character in the string
        for (int i = 0; i < word.length(); i++) {
            // Store key, value pair in the HashMap of characters.
            // Key = charAt(i). Value = existingValue + 1 or 0 + 1
            storedChar.put(
                    String.valueOf(word.charAt(i)),                                             // key
                    storedChar.getOrDefault(String.valueOf(word.charAt(i)), 0) + 1  // value
            );
        }
        // Print the HashMap
        System.out.println(storedChar);
    }
}