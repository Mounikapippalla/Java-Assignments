
import java.util.Scanner;

public class As3 {
    public static void max(int[] arr){
       int max = arr[0];
       for(int i=1; i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
       System.out.println("Maximum Element:"+ max);
       String s = (max%2 == 0)? "Even ": "Odd";
       System.out.println("It is an"+s +"number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[]= new int[a];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        max(arr);
    }
    
}
// Assignment 3: Find Largest Element and Check if it’s Odd or Even
// Question:
// Find the largest element in the array and determine if it's odd or even.
// Input Format:
// [10, 23, 45, 89, 76]
// Output Format:
// Maximum element: 89
// It is an Odd number.
