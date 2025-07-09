package Conditional_statements_and_loops;
import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        int n, r, temp, sum = 0;
        System.out.println("Enter the number to check if it is an armstrong number or not : ");
        n = obj.nextInt();
        temp = n;

        while(n>0){

            r = n %10;
            sum = (sum) + (r * r * r);
            n = n / 10;

        }
        if(temp == sum){
            System.out.println("The number is an armstrong number");
        }else{
            System.out.println("The number is not an armstrong number");
        }
        obj.close();

    }
    
}
