import java.util.*;
public class Distinction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int per;
        System.out.println("Enter Your Percentage");
        per = sc.nextInt();
        if(per>=75){
            System.out.println("Distinction");
        }
        else{
            System.out.println("Not a distinction");
        }
    }
}
