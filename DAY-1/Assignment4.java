
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        System.out.println("Original value before function call:"+b);

        changeValue(b); 
        System.out.println("value inside function:"+b);
        System.out.println("Original value after function call:"+b);
    }
    
    static void changeValue(int x){
         x=100;
         System.out.print(x);
    }
}

// Question:
// Create a method changeValue(int x) which sets x = 100.
// In main(), take an integer input from the user, call changeValue() with it, and then print the value of the original variable.
// Input Format:
// 10
// Output Format:
// Original value before function call: 10
// Value inside function: 100
// Original value after function call: 10
