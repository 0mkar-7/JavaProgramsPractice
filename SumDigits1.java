import java.util.Scanner;

public class SumDigits1 {
    public static void main(String[] args) {
        int num , rem , ans =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        num = sc.nextInt();
        while(num>0){
            rem = num%10;
            ans = ans+rem;
            num = num/10;
        }
        System.out.println("Sum of Digits is "+ans);
    }
}
