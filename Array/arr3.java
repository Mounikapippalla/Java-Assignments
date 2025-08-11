public class arr3 {
    public static void main(String[] args) {
        int fl=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        int tl= Integer.MIN_VALUE;
        int arr[]={10,35,12,4,5,2};
        for (int num: arr){
            if(num > fl){
                tl=sl;
                sl=fl;
                fl=num;
            }
            else if(num> sl && num!=fl && num>tl){
                tl=sl;
                sl=num;
            }else if (num> tl && num!= fl && num!= fl){
                tl=num;
            }
        }
        int result= fl*sl*tl;
        System.out.println(result);
    }
    
}
