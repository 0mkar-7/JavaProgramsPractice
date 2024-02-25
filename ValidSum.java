import java.util.*;
public class ValidSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        int n = sc.nextInt();
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum +=rem;
            n=n/10;
        }
        if(sum>10){
            System.out.println("Sum of digits is greater than 10");
        }
        else if(sum==10){
            System.out.println("Sum  of digits is equal to 10");
        }
        else{
            System.out.println("Sum of digits is less than 10");
        }

    }
}
