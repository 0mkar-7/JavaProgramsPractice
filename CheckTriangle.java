import java.util.*;
public class CheckTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1,a2,a3;
        System.out.println("Enter Three angles");
        a1 = sc.nextInt();
        a2 =sc.nextInt();
        a3 = sc.nextInt();
        int sum = a1+a2+a3;
        if(sum!=180){
            System.out.println("It is Not a Triangle");
        }
        else{
            System.out.println("It is a Triangle");
        }
    }
}
