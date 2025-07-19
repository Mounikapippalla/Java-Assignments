import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            int space=i;
            int star=a-space; 
            for(int j=0; j<=star; j++){
                System.out.print("*");
            }
            for(int j =0; j<=space; j++){
                System.out.print(" ");
            }
        System.out.println();
        }
    }
    
}
