package Conditional_statements_and_loops;
import java.util.Scanner;

public class Binary_converter {
    
    public static void main(String[] args){

        System.out.println("Enter the decimal number to convert it into binary : ");
        Scanner obj = new Scanner(System.in);
        double n = obj.nextDouble();

        int i = 0;
        int binary[] = new int[100];
        while(n > 0){
            binary[i] = (int)(n % 2);
            n = Math.floor(n / 2);
            i++;
        }
        System.out.print("The binary number is : ");
        for(int j = i - 1; j >= 0; j--){
            System.out.print(binary[j]);
        }
        System.out.println();
        obj.close();        
    }

}
