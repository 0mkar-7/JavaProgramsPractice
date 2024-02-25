import java.util.*;
public class ReverseNumLoop {
    public static void main(String args[]){
        int rem , rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        while(num>0){
            rem = num%10;
            rev = rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse is "+rev);
        
    }
    
}
