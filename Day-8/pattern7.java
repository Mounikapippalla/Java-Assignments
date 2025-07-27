public class pattern7 {
    public static void main(String[] args) {
        int n=5;
        for(int rval=1;rval<=n;rval++){
            for(int cval=1; cval<=n ;cval++){
                if(rval==cval){
                    System.out.print("*");
                }
                else if(rval+cval==(n+1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
    
}
