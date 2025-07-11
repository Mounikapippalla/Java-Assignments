
import java.util.Scanner;

public class As4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int arr[]= new int[a];
        int arr2[]= new int[a];
        int count= 0;

        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
            if(arr[i]>x){
                arr2[count]=arr[i];
                count++;
            }
        }
        System.out.println("Elements greater than"+x+" : "+arr2);



    }
}


// Assignment 4: Print Only Elements Greater Than a Given Number
// Question:
// Take a number 'x' and print all array elements greater than x using a for-each loop.
// Input Format:
// x = 25
// Array = [10, 30, 20, 40, 50]
// Output Format:
// Elements greater than 25: 30 40 50
