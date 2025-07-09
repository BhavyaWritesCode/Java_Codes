package Conditional_statements_and_loops;
import java.util.Scanner;

public class Division {

    public static void main(String[] args){

        System.out.println("Enter the Number till You want Result: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){ 
            if(i % 3 == 0 && i % 5 == 0){ 
                System.out.println("FIZZBUZZ");
            }
            else if(i % 3 == 0){ 
                System.out.println("FIZZ");
            }
            else if(i % 5 == 0){ 
                System.out.println("BUZZ");
            }
            else{
                System.out.println(i);
            }
        }

        sc.close();
        System.out.println("End of Program");
    }
}
