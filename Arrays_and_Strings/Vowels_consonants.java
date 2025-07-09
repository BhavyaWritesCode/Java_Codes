package Arrays_and_Strings;
import java.util.Scanner;

public class Vowels_consonants {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Sentence to count vowels and consonants: ");
        String sentence = obj.nextLine().toLowerCase(); 
        int vowels = 0, consonants = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') { 
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        obj.close();
    }
}
