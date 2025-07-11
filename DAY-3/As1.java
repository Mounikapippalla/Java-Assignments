import java.util.*;
class As1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = ~a;
        String b = Integer.toBinaryString(a);
        // String string = String.format(format:"%29d",b);
        System.out.println("Original:"+ a);
        System.out.println("Binary:"+ b);

        System.out.println("Binary of ~:"+ c);


    }
}