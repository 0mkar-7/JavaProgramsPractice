import java.util.*;
public class CheckNum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Number ");
       int num = sc.nextInt();
       if(num<20){
        System.out.println("Number  is less than 20");  
       } 
       else if(num==20){
        System.out.println("Number Entered is 20");
       }
       else{
        System.out.println("Number is greater than 20");
       }
    }
}
