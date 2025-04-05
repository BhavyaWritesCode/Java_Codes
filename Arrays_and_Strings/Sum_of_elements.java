package Java_Codes.Arrays_and_Strings;
import java.util.Scanner;

public class Sum_of_elements {

    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array :");
        n = obj.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array : ");
        for(int i =0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        int sum = 0;
        for(int i = 0;i<n; i++){
            sum += arr[i];
        }
        System.out.println("The sum of the elements of the array is : " + sum);
        obj.close();
    }
    
}
