import java.util.*;
public class MultiplyWoStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        for(int i=1;i<=b;i++){
            sum+=a;
        }
        System.out.println("Sum is"+ sum);

    }
}
