public class Binary_method {

    public static String decimalToBinary(int num) {
        String binary = "";
        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary;
            num = num / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        int number = 13;
        String binary = decimalToBinary(number);
        System.out.println("Binary of " + number + " is: " + binary);
    }
}
