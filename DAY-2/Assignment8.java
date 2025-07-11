import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Length:"+ l);
        System.out.println("Breadth:"+ b);
        int a = l*b;
        int p = 2*a; 
        System.out.println("Area:"+ a);
        System.out.println("Perimeter:"+ p);
    }
    
}
// Question:
// Take length and breadth as input and calculate:
// - Area = length × breadth
// - Perimeter = 2 × (length + breadth)
// Input Format:
// Length = 10
// Breadth = 5
// Output Format:
// Area: 50
// Perimeter: 30
