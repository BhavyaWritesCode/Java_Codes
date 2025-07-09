package Arrays_and_Strings;
import java.util.Scanner;

public class Common_elements {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array: ");
        int n1 = obj.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the elements of the first array: ");      
        for(int i = 0; i < n1; i++){
            arr1[i] = obj.nextInt();
        }
        System.out.println("Enter the number of elements in the second array: ");
        int n2 = obj.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the elements of the second array: ");
        for(int i = 0; i < n2; i++){
            arr2[i] = obj.nextInt();
        }


        System.out.println("The common elements in the two arrays are: ");
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
        obj.close();

    }
    
}
