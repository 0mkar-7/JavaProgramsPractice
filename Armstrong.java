import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        int num , rem , sum = 0;
        Scanner sc= new  Scanner(System.in);
        System.out.println("Enter a Number ");
        num = sc.nextInt();
        int numSave = num;
        while(num>0){
            rem = num%10;
            sum = sum + (rem*rem*rem);
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
