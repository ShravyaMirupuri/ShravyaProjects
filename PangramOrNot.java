import java.util.HashSet;

public class PangramOrNot {
    public static boolean isPangram(String input) {
        // Remove spaces and convert the input to lowercase
        input = input.replaceAll(" ", "").toLowerCase();

        // Create a set to store unique characters
        HashSet<Character> charSet = new HashSet<>();

        // Iterate through the input string and add each character to the set
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                charSet.add(c);
            }
        }

        // Check if the size of the set is 26 (number of alphabets)
        return charSet.size() == 26;
    }

    public static void main(String[] args) {
        String input = "Six big devils from japan quickly forgot how to waltz ";
        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
