package Java_Codes.Basic_Syntax;

public class Type_casting {
    
    // Converting int to String
    public int StringToInt(String str){
        return Integer.parseInt(str);
    }

    // Converting double to int
    public int DoubleToInt(double d){
        return (int)d;
    }

    //Converting String to int
    public double StringToDouble(String str){
        return Double.parseDouble(str);
    }

    public static void main(String[] args){

        Type_casting obj = new Type_casting();  
        int a = obj.StringToInt("10");
        int b = obj.DoubleToInt(3.9);
        double c = obj.StringToDouble("3.9");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}

/*  
Note : you can use static class also if you don't want to create object of class
 and you can directly call the method using class name.   
 Example :    
 public static int StringToInt(String str){
     return Integer.parseInt(str);    
 }
*/