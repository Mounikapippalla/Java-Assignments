import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    
    System.out.println("Addition:"+ (a+b));
    System.out.println("Subtraction:"+ (a-b));
    System.out.println("Multiplication:"+ (a*b));
    System.out.println("Division:"+ (a/b));
    System.out.println("Modulus:"+ (a%b));
    System.out.println("Greater than:"+ (a>b));
    System.out.println("Less than:"+ (a<b));
    System.out.println("Equal to:"+ (a=b));
    System.out.println("Logical AND :"+ (a>5 && b<10));
    System.out.println("Logical OR :"+ (a>5 || b<10));
    System.out.println("Bitwise AND :"+ (a & b));
    System.out.println("Bitwise OR :"+ (a | b));
    System.out.println("Left Shift :"+ (a<<1));
    System.out.println("Right Shift:"+ (a>>1));
    scanner.close();

}
    
    

}

// Assignment 2: Operator Evaluation
// Question:
// Take two integers as input and perform the following operations:
// - Addition, Subtraction, Multiplication, Division, Modulus
// - Greater than, Less than, Equal to
// - Logical AND, OR, NOT
// - Bitwise AND (&), OR (|), Left Shift (<<), Right Shift (>>)
// Print the result of each operation.
// Input Format:
// 10
// 5
// Output Format:
// Addition: 15
// Subtraction: 5
// Multiplication: 50
// Division: 2
// Modulus: 0
// Greater than: true
// Less than: false
// Equal to: false
// Logical AND (a>5 && b<10): true
// Logical OR (a>10 || b<10): true
// Bitwise AND: 0
// Bitwise OR: 15
// Left Shift (a << 1): 20
// Right Shift (a >> 1): 5
