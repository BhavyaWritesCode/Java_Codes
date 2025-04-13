package Java_Codes.Arrays_and_Strings;

import java.util.Scanner;

public class Anagram_string {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String str1 = obj.nextLine();
        System.out.println("Enter the second String: ");
        String str2 = obj.nextLine();

        // Convert to lowercase and remove whitespace
        str1 = str1.toLowerCase().replaceAll("\\s+", "");
        str2 = str2.toLowerCase().replaceAll("\\s+", "");

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
            obj.close();
            return;
        }

        int[] freq1 = new int[26]; // for str1
        int[] freq2 = new int[26]; // for str2

        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i) - 'a']++;
            freq2[str2.charAt(i) - 'a']++;
        }

        // Compare both frequency arrays
        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        obj.close();
    }
}
