public class arr4 {
    public static void main(String[] args) {
        int Currentcount=1;
        int LongestStreak=1;
        int arr[]={0,1,0,1,1,1,1};
        for(int i =0; i<arr.length-1; i++){
            if(arr[i]== arr[i+1]){
                Currentcount++;
            }else {
                Currentcount=1;
            }
        }
        if(Currentcount>LongestStreak){
            LongestStreak=Currentcount;
        }
        System.out.println(LongestStreak);
    }
}
