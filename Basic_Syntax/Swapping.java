package Java_Codes.Basic_Syntax;

import java.util.Scanner;

public class Swapping {

    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        int a , b;

        System.out.println("Enter the value of a : ");
        a = obj.nextInt();
        System.out.println("Enter the value of b : ");
        b = obj.nextInt();

        System.out.println("Before Swapping :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        obj.close();

    }
    
}
