package Java_Codes.Arrays_and_Strings;
import java.util.Scanner;

public class Ascending {

    // Function to sort array in ascending order
    public static void sortAscending(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The elements of the array in ascending order are: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to sort array in descending order
    public static void sortDescending(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The elements of the array in descending order are: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Choose 1 for Ascending order and 2 for Descending order: ");
        int choice = obj.nextInt();

        System.out.println("Enter the number of elements in the array: ");
        int n = obj.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }

        if(choice == 1){
            sortAscending(arr);
        } else if(choice == 2){
            sortDescending(arr);
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        obj.close();
    }
}
