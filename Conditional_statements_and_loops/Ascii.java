package Java_Codes.Conditional_statements_and_loops;
import java.util.Scanner;

public class Ascii {

    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        String str;
        System.out.println("Enter the string to convert into lowercase into uppercase and vice-versa : ");
        str = obj.nextLine();
        char ch;
        String str1 = "";
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
                str1 += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + 32);
                str1 += ch;
            }
            else{
                str1 += ch;
            }
        }
        System.out.println("The converted string is : " + str1);
        obj.close(); 

    }
    
}
