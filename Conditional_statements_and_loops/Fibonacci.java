package Java_Codes.Conditional_statements_and_loops;
import java.util.Scanner;
public class Fibonacci {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the number of terms in the Fibonacci series:");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();

        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: " + a + ", " + b);
        for (int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
        System.out.println("The " + num + "th term in the Fibonacci series is: " + b);
        obj.close();
    }   
}
