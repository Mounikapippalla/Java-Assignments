public class arr2 {
    public static void main(String[] args) {
        int fl= Integer.MIN_VALUE;
        int sl= Integer.MIN_VALUE;
        int tl = Integer.MIN_VALUE;
        int []arr={12,35,1,10,34,1};
        for(int num: arr){
            if (num> fl){
                tl=sl;
                sl=fl;
                fl=num;
            }
            else if(num>sl){
                tl=sl;
                sl=num;
            }
            else if (num>tl){
                tl=num;
            }
        }
         System.out.println(tl);
    }
    
}
