public class reverse {
    public static void main(String[] args) {
        int n= 123;
        String s= n+"";
        // String rev= s.
        for(int i=s.length() ;i>=0; i--){
            System.out.println(s.charAt(i));
        }
    }
}
