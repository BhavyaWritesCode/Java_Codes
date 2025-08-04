
public class Method_Overloading {

    // Area of square
    public static int area(int side) {
        return side * side;
    }

    // Area of rectangle
    public static int area(int length, int width) {
        return length * width;
    }

    // Area of circle
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    //Main
    public static void main(String[] args) {
        System.out.println("Area of square: " + area(4));
        System.out.println("Area of rectangle: " + area(5, 7));
        System.out.println("Area of circle: " + area(3.5));
    }
}
