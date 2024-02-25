import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f0 =0,f1=1,f2,num;
        System.out.println("Enter a range ");
        num = sc.nextInt();
        System.out.print(f0+"\t"+f1);
        for(int i=3;i<num;i++){
            f2=f0+f1;
            System.out.print("\t "+f2);
            f0=f1;
            f1=f2;
        }

    }
}
