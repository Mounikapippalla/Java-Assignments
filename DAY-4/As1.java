import java.util.Scanner;
public class As1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr= new int[a];
        int sum = 0;
        for(int i=0; i<arr.length;i++){
           arr[i]= scanner.nextInt();
           if (arr[i]%2 == 0){
            sum = sum+arr[i];
           }

        }
        System.out.println("Sum of even elements:"+sum);
    }
}


// Question:
// Take an array from the user and print the sum of only even elements using a for loop.
// Input Format:
// [2, 5, 8, 11, 4]
// Output Format:
// Sum of even elements: 14
