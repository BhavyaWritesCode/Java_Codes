import java.util.*;
public class Summ {

    public int sum(int a, int b) {
        return a + b;
    }
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Summ obj = new Summ();
        
        System.out.println("Enter two numbers to find their sum:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum of " + a + " and " + b + " is: " + obj.sum(a, b));
        
        System.out.println("Enter three numbers to find their sum:");
        int c = sc.nextInt();
        System.out.println("The sum of " + a + ", " + b + ", and " + c + " is: " + obj.sum(a, b, c));
        
        sc.close();
    }
    
}
