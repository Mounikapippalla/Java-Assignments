
import java.util.Scanner;

public class As6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printTable(a);
        sc.close();
    }
    static void printTable(int n){
        for(int i=1 ;i<10 ; i++){
            System.out.print(n * i +" ");
        }


    }
}

// Assignment 6: Function with Parameters & No Return Type
// Question:
// Write a function void printTable(int n) that prints table of a number.
// Input Format:
// 5
// Output Format:
// 5 10 15 20 25 30 35 40 45 50
