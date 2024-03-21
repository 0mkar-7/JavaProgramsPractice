import java.util.*;
public class SumOfArmstrong3 {
    public static void main(String[] args) {
        int num , rem  ,i ;
        double sum;
        int count;
        int sum1=0;
        Scanner sc= new  Scanner(System.in);
        for(i=1;i<=10000;i++){
             sum = 0;
             count = 0;
            num=i;
            int numSave = num;


            while(num>0){
                num = num/10;
                count++;
            
            }
            num = numSave;
            while(num>0){
                rem = num%10;
                sum += (Math.pow(rem,count));
                num=num/10;
                
            
            }

             if(sum == numSave){
                System.out.println(numSave);
                if(count==3){
                    sum1 = sum1 + numSave;
                }

              }
           
        }
        System.out.println("Addition of three digit armstrong numbers is "+sum1);
    }
}
