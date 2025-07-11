import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    int a = scanner.nextInt();
    System.out.println("Celsius :"+ a);
    float d  = ((a *(9/5)) + 32);
    System.out.println("Fahrenheit : "+ d);
    }

}
// Question:
// Take temperature in Celsius as input and
//  convert it to Fahrenheit using the formula: F = (C × 9/5) + 32
// Input Format:
// Celsius = 37
// Output Format:
// Fahrenheit: 98.6
