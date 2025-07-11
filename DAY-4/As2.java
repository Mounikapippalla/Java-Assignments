
import java.util.Scanner;

public class As2 {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        int a = sc.nextInt();
        int count =0;
        int arr[]= new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int i =0;
        while(i<a){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
                count++;
            }
            i++;
        }
        System.out.println();
        System.out.println(count);
        
    }
}


// Assignment 2: Count and Print Odd Numbers (while loop + if condition)
// Question:
// Using a while loop, count how many odd numbers are present in the array and print them.
// Input Format:
// [3, 6, 9, 12, 15]
// Output Format:
// Odd numbers: 3 9 15
// Count: 3
