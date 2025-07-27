
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int original_num = a;
        int rev_num=0;
        while(a>0){
            int last_digit= a%10;
            rev_num = (rev_num*10)+last_digit;
            a=a/10;
        }
        System.out.println(rev_num);

        if(rev_num== original_num){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
