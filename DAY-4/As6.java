
import java.util.Scanner;

public class As6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr [] []= new int[a][b];
        for (int i =0; i<a ; i++){
            for (int j = 0 ; j<b ; j++){
                arr[i][j]= sc.nextInt();
                if (i== j){
                    arr[i][j]
                    System.out.println("Diagonal Elements:"+arr[i][j]);
                }
            }

        }
    }
    
}


// Assignment 6: 2D Matrix – Print Only Diagonal Elements
// Question:
// Take a 3x3 matrix and print only the diagonal elements (i == j).
// Input Format:
// [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
// Output Format:
// Diagonal elements: 1 5 9

