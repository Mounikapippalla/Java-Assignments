
import java.util.Scanner;

public class As4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        int a = (int) f;
        byte b =(byte) f;
        System.out.println("To int:"+a);
        System.out.println("To byte:"+b);

        
    }
    
}
// Assignment 4: Explicit Type Casting
// Question:
// Convert a float to int and byte using casting.
// Input Format:
// float f = 123.456f;
// Output Format:
// To int: 123
// To byte: 123
