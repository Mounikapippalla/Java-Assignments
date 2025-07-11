import java.util.Scanner;

public class As2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<0){
            int b = a>>2;
            // int c = a>>>3;
            System.out.println("Signed ("+a+">> 2 ):"+b);
            System.out.println("Unsigned ("+a+">>> 2 ):"+(a>>>3));
        }
        
    }
}
// Assignment 2: Signed vs +Unsigned Right Shift
// Question:
// Take a negative number and show the result of >> and >>> with binary.
// Input Format:
// -8
// Output Format:
// Signed (-8 >> 2): -2
// Unsigned (-8 >>> 2): 1073741822
