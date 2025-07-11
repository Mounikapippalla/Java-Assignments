import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String result = (a%2 ==0 )? "Even" : "Odd";
        System.out.println("The number is:"+result);
        
    }   
}

// Question:
// Take an integer input from the user. Use the ternary operator to 
// check whether the number is even or odd. Print the result.
// Input Format:
// 7
// Output Format:
// The number 7 is Odd
