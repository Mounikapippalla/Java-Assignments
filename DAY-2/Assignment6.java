import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Before Swap: a = "+a +", b ="+ b);
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println("After Swap: a = "+a +", b ="+ b);

    }
    
}

// Question:
// Take two integers and swap them using bitwise XOR ( ^ )
//  operator without using a third variable. Print the values before and after swapping.
// Input Format:
// a = 5
// b = 7
// Output Format:
// Before Swap: a = 5, b = 7
// After Swap: a = 7, b = 5
