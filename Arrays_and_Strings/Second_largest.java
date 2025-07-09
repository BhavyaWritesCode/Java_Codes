package Arrays_and_Strings;
import java.util.Scanner;

public class Second_largest {

    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in an array : ");
        n = obj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        int largest = arr[0];   
        int second_largest = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_largest && arr[i] != largest){
                second_largest = arr[i];
            }
        }
        if(second_largest == largest){
            System.out.println("There is no second largest element in the array.");
        }
        else{
            System.out.println("The second largest element in the array is : " + second_largest);
        }
        obj.close();

    }
    
}
