import java.util.*;
public class SumOfEve {
    public static void main(String[] args) {
        int num , sum= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range ");
        num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("Sum is "+sum);
    }
}
