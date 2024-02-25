import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        int num , count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        num = sc.nextInt();
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.println("Count of Digits is "+count);

    }
}
