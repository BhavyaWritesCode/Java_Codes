package Arrays_and_Strings;
import java.util.Scanner;

public class Duplicate {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //logic to delete duplicate elements
        int[] unique = new int[n];
        int uniqueCount = 0;

        for(int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for(int j = 0; j < uniqueCount; j++) {
                if(arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                unique[uniqueCount++] = arr[i];
            }
        }

        System.out.println("\nDuplicate elements are deleted from the array.");
        System.out.println("The original size of the array: " + n);
        System.out.println("The size after removing duplicates: " + uniqueCount);
        System.out.println("Array after deleting duplicates:");

        for(int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
