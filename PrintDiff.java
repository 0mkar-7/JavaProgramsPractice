import java.util.*;
public class PrintDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a Range ");
        num = sc.nextInt();
        for(int i=num; i>=1; i=i-2){
            System.out.println(i);
        }
    }
}
