import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        String name = a.next();
        greetUser(name);
        
    }
   public static void greetUser(String name){
    System.out.println("Hello "+ name + ", welcome to the MERN + DSA batch!");
   }
    
}

 //Question:
// Create a method greetUser(String name) that prints:
// Hello <name>, welcome to the MERN + DSA batch!
// Take input from the user in main() and call the function.
// Input Format:
// Prudhvi
// Output Format:
// Hello Prudhvi, welcome to the MERN + DSA batch!
