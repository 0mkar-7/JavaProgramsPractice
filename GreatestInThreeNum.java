import java.util.*;

public class GreatestInThreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+" is Greatest among the three");
            }
            else{
                System.out.println(num3 + " is Greatest among the three");
            }
        }
        else{
            if(num2>num3){
                System.out.println(num2 + " is Greatest among the three");
            }
            else{
                System.out.println(num3 + " is Greatest among the three");
            }
        }
    }
}
