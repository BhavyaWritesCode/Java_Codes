package Arrays_and_Strings;
import java.util.Scanner;

public class Occurrences {

        public static void main(String[] args){

            Scanner obj = new Scanner(System.in);
            int n;
            System.out.println("Enter the number of elements in the array : ");
            n = obj.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of the array : ");
            for(int i = 0; i < n; i++){
                arr[i] = obj.nextInt();
            }
            int count = 0;
            for(int i = 0; i < n; i++){
                count = 1;
                for(int j = i + 1; j < n; j++){
                    if(arr[i] == arr[j]){
                        count++;
                        arr[j] = -1; // Mark as visited
                    }
                }
                if(arr[i] != -1){
                    System.out.println("Element " + arr[i] + " occurs " + count + " times.");
                }
            }
            obj.close();

        }

    }
    
