public class Pattern7 {
    public static void main(String[] args) {
        int n=3;
        int star=1;
        int space =n-star;
        for(int i=0;i<n;i++){
            int cval=1;
            for(int col=1; col<=space;col++){
                System.out.println(" ");
            }

            for(int col=1 ; col<=star; col++){
                System.out.println(cval);
                // cval++;
            }
            space-=1;
            star+=2;
            System.out.println(" ");

        }
    }
}
