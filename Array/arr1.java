public class arr1 {
    public static void main(String[] args) {
        int [] arr={12,35,1,10,34,1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num: arr){
            if (num> largest){
                secondLargest= largest;
                largest=num;
            }else if(num>secondLargest && num != secondLargest){
                secondLargest= num;
            }

        }
        if(secondLargest==Integer.MIN_VALUE){
            System.out.print(-1);
        }
        else {
            System.out.println(secondLargest);
        }

    }
}
