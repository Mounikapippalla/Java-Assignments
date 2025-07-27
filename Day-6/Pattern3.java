public class Pattern3 {
    public static void main(String[] args) {
        int n=3;
        int space=0;
        int star=n;
        for(int row=1; row<=n; row++){
            //space
            for(int j=0;j<=space;j++){
                System.out.print("");
            }
            int cval=1;
            // decreasing numbers
            for(int j=1;j<star;j++){
                System.out.println(cval);
                cval+=1;
            }
            space+=1;
            star-=1;
            System.out.println();
    }
    
}
}