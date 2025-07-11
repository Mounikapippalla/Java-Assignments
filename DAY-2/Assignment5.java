import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Before Swap: a = "+a +", b ="+ b);

        a= a+b;
        b = a-b;
        a= a-b;
         System.out.println("After Swap: a = "+a +", b ="+ b);

    }
    
}

// Question:
// Take two integers as input from the user. 
// Swap their values using arithmetic operators (+ and -)
//  without using a third variable. Print the values before and after swapping.
// Input Format:
// a = 10
// b = 20
// Output Format:
// Before Swap: a = 10, b = 20
// After Swap: a = 20, b = 10
