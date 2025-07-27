public class pattern4 {
    public static void main(String[] args) {
        int n=3;
        char rval='A';
        for(int i=1;i<=n;i++){
            char ch= rval;
            for(int j=1;j<=i;j++){
             System.out.print(ch+" ");    
            ch++;

            }
            rval++;
            System.out.println();
        }
    }
}
