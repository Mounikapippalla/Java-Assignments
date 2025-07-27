
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int original_num= a;
        int sum = 0;
        int count=0;
        while (a>0){
             int last = a%10;
             count++;
             a = a/10;
        }
        for(int i=original_num ; i<=1 ; i--){
            sum = (int) (sum + Math.pow(a, count));
            System.out.println();
        }

    }
    
}
