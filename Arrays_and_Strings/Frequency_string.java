package Arrays_and_Strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_string {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = obj.nextLine();

        // Optional: Convert to lowercase and remove whitespace
        str = str.toLowerCase().replaceAll("\\s+", "");

        // Create a map to store frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("\nCharacter frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        obj.close();
    }
}
