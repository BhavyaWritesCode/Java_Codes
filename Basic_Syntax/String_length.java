package Basic_Syntax;

import java.util.Scanner;

public class String_length {

    public void length(String str) {
        int len = 0;
        for (char _ : str.toCharArray()) {
            len++;
        }
        System.out.println("Length of the string: " + len); 
    }

    public static void main(String[] args) {
        String_length obj = new String_length();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        
        String str = sc.nextLine();
        obj.length(str); 

        sc.close();
    }
}
