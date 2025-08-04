
public class Method_returnType {

    // Sum of two numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Check even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Return maximum of two numbers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Sum: " + sum(a, b));
        System.out.println("Is " + a + " even? " + isEven(a));
        System.out.println("Max of " + a + " and " + b + ": " + max(a, b));
    }
}
