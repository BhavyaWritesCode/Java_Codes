package Arrays_and_Strings;
import java.util.Scanner;

public class Convert_string {

    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = obj.nextLine();
        System.out.println("Converting String into Character Array:");
        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            System.out.print(charArray[i] + " ");
        }
        System.out.println();

        System.out.println("Converting String into Byte Array:");
        byte[] byteArray = str.getBytes();  
        for(int i = 0; i < byteArray.length; i++){
            System.out.print(byteArray[i] + " ");
        }
        System.out.println();
        System.out.println("Converting Byte Array into String:");
        String newStr2 = new String(byteArray);
        System.out.println(newStr2);
        obj.close();

    }
    
}
