package Java_Codes.Conditional_statements_and_loops;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){
        
        int num;
        int fact = 1;
        System.out.println("Enter a number to find its factorial : ");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        obj.close();

        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
        
        
    }
    
}

