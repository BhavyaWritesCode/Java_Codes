package Java_Codes.Basic_Syntax;

public class Declaring_variables {
    
    byte x = 127; // byte range is from -128 to 127
    int a = 10;
    double b = 3.9;
    char g = 'A';
    boolean h = true;
    long d = 1000000000;
    float e = 3.14f;

    String c = "We are declaring variables"; 

    public static void main(String[] args){
        Declaring_variables obj = new Declaring_variables();  // Create an object
        
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
        System.out.println(obj.e);
        System.out.println(obj.g);
        System.out.println(obj.h);
        System.out.println(obj.x);
        
    }
}