
import java.util.Scanner;

public class As9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("Largest number:"+ a);
        }else if (b>a && b>c){
            System.out.println("Largest number:"+ b);
        }else {
            System.out.println("Largest number:"+ c);
        }
        sc.close();
    }
    
}


//  Assignment 9: Selection Statements – Largest of 3 Numbers
// Question:
// Take three numbers and print the largest using if-else-if.
// Input Format:
// 15 10 25
// Output Format:
// Largest number: 25
