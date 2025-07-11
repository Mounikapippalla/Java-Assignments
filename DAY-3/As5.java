
import java.util.Scanner;

public class As5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = max(x,y);
        System.out.println("Greater number is:"+ z);
        
    }
    public static int max(int a , int b){
        return (a>b)? a : b;
    }
}
// Assignment 5: Function with Parameters & Return Type
// Question:
// Write a function int max(int a, int b) to return the greater number.
// Input Format:
// 10
// 20
// Output Format:
// Greater number is: 20
