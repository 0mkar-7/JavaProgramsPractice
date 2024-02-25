import java.util.*;
public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1,a2,a3;
        System.out.println("Enter Three angles : ");
        a1=sc.nextInt();
        a2=sc.nextInt();
        a3=sc.nextInt();
        int sum = a1+a2+a3;
        if(sum<=180){
        if(a1==90||a2==90||a3==90){
            System.out.println("It is a Right angles triangle");
        }
        else if(sum <90){
            System.out.println("It is a Acute Triangle");
        }
        else{
            System.out.println("It is a obtuse  Triangle");
        }
    }
    else{
        System.out.println("Invalid angles , sum of angles should be less than equal yo 180!");
        }
    }
}
