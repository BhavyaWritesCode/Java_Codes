package Conditional_statements_and_loops;
import java.util.Scanner;

public class Strong_num {
    
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        int n, r, temp, sum = 0, fact;
        System.out.println("Enter the number to check if it is a strong number or not : ");
        n = obj.nextInt();
        temp = n;

        while(n>0){

            r = n %10;
            fact = 1;
            for(int i=1; i<=r; i++){
                fact = fact * i;
            }
            sum = (sum) + (fact);
            n = n / 10;

        }
        if(temp == sum){
            System.out.println("The number is a strong number");
        }else{
            System.out.println("The number is not a strong number");
        }
        obj.close();

    }
    
}

/*The Given number will be a strong number if the sum of the factorial of the digits is equal to the number */