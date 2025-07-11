import java.util.Scanner;

public class Assignment1{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    byte a = scanner.nextByte();
    short b = scanner.nextShort();
    int c = scanner.nextInt();
    long d = scanner.nextLong();
    float e = scanner.nextFloat();
    double f = scanner.nextDouble();

    System.out.println("Byte: "+a+ "Range:"+ Byte.MIN_VALUE +"to"+ Byte.MAX_VALUE);
    System.out.println("Short: "+b+ "Range:"+ Short.MIN_VALUE +"to"+ Short.MAX_VALUE);
    System.out.println("int: "+c+ "Range:"+ Integer.MIN_VALUE +"to"+ Integer.MAX_VALUE);
    System.out.println("Short: "+d+ "Range:"+ Long.MIN_VALUE +"to"+ Long.MAX_VALUE);
    System.out.println("Short: "+e+ "Range:"+ Float.MIN_VALUE +"to"+ Float.MAX_VALUE);   
    System.out.println("Short: "+f+ "Range:"+ Double.MIN_VALUE +"to"+ Double.MAX_VALUE); 
    scanner.close();
    }

    
    
}


// Question:
// Take input from the user for the following data types:
// - byte
// - short
// - int
// - long
// - float
// - double
// Print their values and also print the minimum and maximum 
// range of each data type using wrapper classes (e.g., Byte.MIN_VALUE, Byte.MAX_VALUE).
// Input Format:
// 12
// 32000
// 123456789
// 9876543210
// 3.14
// 12345.6789
// Output Format:
// Byte: 12, Range: -128 to 127
// Short: 32000, Range: -32768 to 32767
// Int: 123456789, Range: -2147483648 to 2147483647
// Long: 9876543210, Range: -9223372036854775808 to 9223372036854775807
// Float: 3.14, Range: 1.4E-45 to 3.4028235E38
// Double: 12345.6789, Range: 4.9E-324 to 1.7976931348623157E308
