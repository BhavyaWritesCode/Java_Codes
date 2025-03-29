package Java_Codes.Basic_Syntax;

import java.util.Scanner;

public class Natural_number {

    public static void main(String[] args){

        int num;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number of natural number for sum");
        num = obj.nextInt();

        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }

        System.out.println("The sum of first " + num + " natural number is : " + sum);
        obj.close();
        

    }
    
}
