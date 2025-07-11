import java.util.Scanner; 
public class Assignment4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    System.out.println("Original:"+ a);
    System.out.println("Pre Increment:"+ (++a) );
    System.out.println("Post Increment:"+ (a++) +",then becomes "+(a));
    System.out.println("Pre Decrement:"+ (--a));
    System.out.println("Post Decrement:"+ (a--)+", then becomes "+(a));

}
}
    
// Question:
// Take an integer input from the user. Show the difference between:
// - Pre-increment (++a)
// - Post-increment (a++)
// - Pre-decrement (--a)
// - Post-decrement (a--)
// Print the value at each step.
// Input Format:
// 5
// Output Format:
// Original: 5
// Pre-Increment: 6
// Post-Increment: 6 (printed), then becomes 7
// Pre-Decrement: 6
// Post-Decrement: 6 (printed), then becomes 5
