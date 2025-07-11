
import java.util.Scanner;

public class As3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        short s = sc.nextShort();
        char c = sc.next().charAt(0);
        int i = sc.nextInt();
        
        int exp = b+s+c+i;

        System.out.println("Expression:"+ exp);
    }
    
}
// Question:
// Use byte, short, char, and int in a single expression to show promotion.
// Input Format:
// byte b = 10; short s = 20; char c = 'A'; int i = 30;
// Output Format:
// Expression: b + s + c + i = 125 ('A' = 65)
