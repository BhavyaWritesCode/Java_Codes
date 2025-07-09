package Arrays_and_Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_string {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = obj.nextLine().trim();// trim() removes leading and trailing spaces

        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        // Manually extract words
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                word.append(ch);
            } else if (word.length() > 0) {
                words.add(word.toString());
                word.setLength(0); // reset for next word
            }
        }

        // Add the last word if exists
        if (word.length() > 0) {
            words.add(word.toString());
        }

        // Print words in reverse order
        System.out.println("Sentence after reversing the words:");
        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.print(words.get(i));
            if (i > 0) System.out.print(" ");
        }

        System.out.println();
        obj.close();
    }
}
