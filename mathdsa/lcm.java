public class lcm{
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int lcm;
        int max;
        if(a>b){
           max= a;
        }else  max=b;
        while (true) { 
            if (max %a ==0 && max%b ==0){
            lcm=max;
            break;
        }
        max++;
            
        }}
       
    }