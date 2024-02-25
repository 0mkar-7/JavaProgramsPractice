import java.util.*;
public class Series2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x , n ,sum=1;
        System.out.println("Enter a Number ");
        x = sc.nextDouble();
        System.out.println("Enter a range ");
        n = sc.nextDouble();
        for(int i=1;i<=n;i++){
            int fact=1;
            int j=i;
            while (j>0) {
                fact=fact*j;
                j--;
            }
            sum+=(Math.pow(x,i))/fact;
        }
        System.out.println("Sum of Series "+sum);

    }
}