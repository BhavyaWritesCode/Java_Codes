package Basic_Syntax;

import java.util.Scanner;

public class Area {

    public void circle(double r){

        double area = 3.14 * r * r;
        System.out.println("Area of Circle : " + area);

    }

    public void rectangle(double l, double b){

        double area = l * b;
        System.out.println("Area of Rectangle : " + area);

    }

    public void triangle(double b, double h){

        double area = 0.5 * b * h;
        System.out.println("Area of Triangle : " + area);

    }

    public static void main(String[] args){

        Area obj = new Area();
        System.out.println("Enter the radius of the circle : ");
        Scanner sc = new Scanner(System.in);    
        double r = sc.nextDouble();
        obj.circle(r);

        System.out.println("Enter the length and breadth of the rectangle : ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        obj.rectangle(l, b);

        System.out.println("Enter the base and height of the triangle : ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        obj.triangle(base, height);

        sc.close();

    }
    
}