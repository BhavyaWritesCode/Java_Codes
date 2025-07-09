package Conditional_statements_and_loops;
import java.util.Scanner;

public class Sum_of_oddEven_numbers {

    public static void main(String[] args){

        int a, b = 0, sum = 0;
        System.out.println("Enter the first number a:");
        try (Scanner obj = new Scanner(System.in)) {
            a = obj.nextInt();
            System.out.println("Enter the second number b:");
            b = obj.nextInt();
            if(a > b){
                System.out.println("The first number should be less than the second number.");
                return;
            }
        int choice = 0;
        System.out.println("Enter 1 to find the sum of even numbers or 2 for odd numbers:");
        choice = obj.nextInt();
        switch(choice){
            case 1:
                System.out.println("You have chosen to find the sum of even numbers.");
                for(int i = a; i <= b; i++){
                    if(i % 2 == 0){ 
                        sum = sum + i;
                    }
                }
                break;
            case 2:
                System.out.println("You have chosen to find the sum of odd numbers.");
                for(int i = a; i <= b; i++){
                    if(i % 2 != 0){ 
                        sum = sum + i;
                    }
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                return;
        }
        
        System.out.println("The sum of numbers between " + a + " and " + b + " is: ");
        System.out.println(sum);
        }
    }
    
}
