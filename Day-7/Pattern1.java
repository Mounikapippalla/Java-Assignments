class Pattern1{
    public static void main(String[]args){
        int n=3;
        for(int i=1 ;i<=n ;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j + " ");
            }
             int spaces = (n - i) * 2;
            for (int s = 1; s <= spaces; s++) {
                System.out.print("  "); 
            }
            for(int k=i;k>=1;k--){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}