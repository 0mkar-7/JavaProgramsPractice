import java.util.*;
public class SumOfFirstNEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range , Eg 100 or 98 .....");
        int num = sc.nextInt();
        int sum =0 ;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                sum+=i;
            }
            else{
                continue;
            }
        }
        System.out.println("Sum of First "+num+" Even Numbers is "+sum);
    }
    
}
