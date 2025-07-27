public class Pattern4 {
    public static void main(String[] args) {
        int n=3;
        int rval=n;
        for(int i=n;i>=0;i--){
            int cval=n;
            for(int j=1; j<=i;j++){
                System.out.print(cval);
                cval--;
            }
            System.out.println();
        }
    }
    
}
