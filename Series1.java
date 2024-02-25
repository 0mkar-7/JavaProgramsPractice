import java.util.*;
public class Series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x , n ,sum=1;
        System.out.println("Enter a Number ");
        x = sc.nextDouble();
        System.out.println("Enter a range ");
        n = sc.nextDouble();
        for(int i=1;i<=n;i++){
            sum+=(Math.pow(x,i))/i;
        }
        System.out.println("Sum of Series "+sum);

    }
}
