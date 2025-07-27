public class pattern3 {
    public static void main(String[] args) {
        int n=3;
        char ch='A';
        for(int i=0; i<=n ;i++){
            int cval=65;
            for(int j=0;j<=ch;j++){
                System.out.print(cval++);
            }

            System.out.println();
        }
    }
}
