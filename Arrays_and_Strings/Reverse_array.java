package Java_Codes.Arrays_and_Strings;
import java.util.Scanner;

public class Reverse_array {

    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = obj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("The original array is: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The reversed array is: ");
        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        obj.close();

    }

}
