import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        float b = scanner.nextFloat();
        String c = scanner.next();
        
        float f = a ; // implicit Concersion

        int d = (int) b; // Explicit Concersion

        int e = Integer.parseInt(c);  //string to int using Integer.parseInt()

        System.out.println("Int to Float: "+ f);
        System.out.println("Float to Int: "+ d);
        System.out.println("String to Int: "+ e);

    }
    
}
