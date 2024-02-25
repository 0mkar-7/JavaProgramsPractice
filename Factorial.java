import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int num , fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        num = sc.nextInt();
        while(num>0){
            fact = fact*num;
            num--;
        }
        System.out.println("Factorial is "+fact);
    }
}
