import java.util.Scanner;

public class As11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float w = sc.nextFloat();
        float h = sc.nextFloat();
        float BMI = w/(h*h);

        System.out.println("Weight ="+ w);
        System.out.println("height ="+ h);
        System.out.println("BMI:"+ BMI);
        sc.close();

    }
    
}
// Question:
// Take weight (kg) and height (m) from user and calculate BMI = weight / (height * height).
// Input Format:
// Weight = 60
// Height = 1.7
// Output Format:
// BMI = 20.76
