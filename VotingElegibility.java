import java.util.*;
public class VotingElegibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are Eligible to Vote");
        }
        else{
            System.out.println("You are Not Eligible to Vote");
        }
    }
}
