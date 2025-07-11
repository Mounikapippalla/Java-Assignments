
import java.util.Scanner;

public class As5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum =0;
        int count =0;
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i =0; i<arr.length;i++){
            arr[i]= sc.nextInt();
            if(arr[i]>0){
                sum = sum+arr[i];
                count++;
            }
        }
        System.out.println("Average of positive numbers:"+(float)sum/count);
    
    }
}
// Assignment 5: Average of Only Positive Numbers (using loop + condition)
// Question:
// From a given array, calculate the average of only positive numbers.
// Input Format:
// [-2, 5, 7, -3, 9]
// Output Format:
// Average of positive numbers: 7.0
