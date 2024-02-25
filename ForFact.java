import java.util.*;
public class ForFact {
    public static void main(String[] args) {
        int fact=1 , num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        num = sc.nextInt();
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial is "+fact);
    }
}
