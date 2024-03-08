//print sum of all divisibles of 3 or 5 until n 
import java.util.*;
public class SumOfDivisibles {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int a = 0; a< t; a++) {

            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i < n; i++) {

                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
            System.out.print(sum);
            
        }

    }
}

