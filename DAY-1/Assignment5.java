import java.util.Arrays;
import java.util.Scanner;


public class Assignment5 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int[] arr={1,2,3};
        System.out.println("Before function call:"+ Arrays.toString(arr));
        modifyArray(arr);
        System.out.println("After function call:"+ Arrays.toString(arr));
        a.close();
    }

    public static void modifyArray(int[] arr){
    arr[0]  = 99;
    System.out.println("Inside function:"+ Arrays.toString(arr));


}

}

    



// Question:
// Create a method modifyArray(int[] arr) that changes arr[0] = 99.
// In main(), create an array, print it before and after calling the method.
// Input Format:
// [1, 2, 3]
// Output Format:
// Before function call: [1, 2, 3]
// Inside function: [99, 2, 3]
// After function call: [99, 2, 3]
