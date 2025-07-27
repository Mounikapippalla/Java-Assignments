import java.util.Scanner;

public class rev_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int rev_num=0;
        while (a>0){
           int last_digit= a%10;
           rev_num= (a*10)+last_digit;
            a= a/10;
        }
        System.out.print(rev_num);

    }
}
