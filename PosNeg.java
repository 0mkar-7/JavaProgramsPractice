import java.util.*;
public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        if(num==0){
            System.out.println(num +" is zero.");
        }
        else if(num>0){
            System.out.println(num + " is Positive.");
        }
        else{
            System.out.println(num + " is Negative.");
        }
    }
}
