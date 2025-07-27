public class interview {
    public static void main(String[] args) {
        int n =1234;
        int sum=0;
        while(n>0){
            int num = n%10;
            if (num%2 ==0){
                sum += factorial(num);
            }
            n = n/10;
        }
        System.out.println(sum);
    }
    

    public static int factorial(int num){
        int fact =1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;

    }

    }


