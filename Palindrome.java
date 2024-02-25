import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        int rem , rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int numSave = num;
        while(num>0){
            rem = num%10;
            rev = rev*10+rem;
            num=num/10;
        }
        if(rev == numSave){
            System.out.println(numSave+" is a Palindrome Number");
        }
        else{
            System.out.println(numSave+" is not a Palindrome Number");
        }
        
    }
    
}
