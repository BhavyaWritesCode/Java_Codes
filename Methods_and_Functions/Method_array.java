public class Method_array {

    // Method to print array
    public static void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Method to return sum of array elements
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }

    // Method to return max element from array
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 25, 15};

        printArray(numbers);
        System.out.println("Sum = " + getSum(numbers));
        System.out.println("Max = " + getMax(numbers));
    }
}
