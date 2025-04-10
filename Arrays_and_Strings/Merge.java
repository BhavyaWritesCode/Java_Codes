package Java_Codes.Arrays_and_Strings;
import java.util.Scanner;

public class Merge {

    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n = obj.nextInt();
        System.out.print("Enter the size of the second array: ");
        int m = obj.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        System.out.println("Enter the elements of the first array:");
        for(int i = 0; i < n; i++){
            arr1[i] = obj.nextInt();
        }
        System.out.println("Enter the elements of the second array:");
        for(int i = 0; i < m; i++){
            arr2[i] = obj.nextInt();
        }
        int arr3[] = new int[n+m];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                arr3[k++] = arr1[i++];
            }else{
                arr3[k++] = arr2[j++];
            }
        }
        while(i < n){
            arr3[k++] = arr1[i++];
        }
        while(j < m){
            arr3[k++] = arr2[j++];
        }
        System.out.println("The merged array is:");
        for(int l = 0; l < n+m; l++){
            System.out.print(arr3[l] + " ");
        }
        System.out.println();
        obj.close();

    }
    
}
