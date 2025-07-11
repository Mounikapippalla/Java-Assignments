import java.util.Scanner;

public class As7 {
    public static int getSquare(){
        return 9*9;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = getSquare();
        System.out.println("Returned square:"+ num);
    }
    
    
}



// Assignment 7: Function without Parameters, with Return Type
// Question:
// Write a function int getSquare() that returns square of 9.
// Output Format:
// Returned square: 81
