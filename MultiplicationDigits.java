import java.util.*;
public class MultiplicationDigits {
    public static void main(String[] args) {
        int num , rem , ans =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        num = sc.nextInt();
        while(num>0){
            rem = num%10;
            ans = ans*rem;
            num = num/10;
        }
        System.out.println("Multiplication of Digits is "+ans);
    }
}
