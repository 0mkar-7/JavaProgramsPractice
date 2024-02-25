import java.util.*;
public class AnyArmstrong {
    public static void main(String[] args) {
        int num , rem  ;
        double sum = 0;
        int count = 0;
        Scanner sc= new  Scanner(System.in);
        System.out.println("Enter a Number ");
        num = sc.nextInt();
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
            System.out.println(numSave+" is a Armstrong Number");

        }
        else{
            System.out.println(numSave+" is not a Armstrong Number");   
        }
    }
}
