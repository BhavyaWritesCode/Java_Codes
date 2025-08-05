public class magic_number {

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    // Function to check if number is magic number
    public static boolean isMagic(int n) {
        int result = n;
        while (result > 9) {
            result = sumOfDigits(result);
        }
        return result == 1;
    }

    public static void main(String[] args) {
        int num = 1729;
        if (isMagic(num)) {
            System.out.println(num + " is a Magic Number ✅");
        } else {
            System.out.println(num + " is NOT a Magic Number ❌");
        }
    }
}
