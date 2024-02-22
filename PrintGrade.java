import java.util.*;
public class PrintGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of 100");
        int marks = sc.nextInt();
        if(marks >100 || marks<0){
            System.out.println("Invalid Marks");
            return;
        }
        if(marks >90){
            System.out.println("O Grade");
        }
        else if (marks >= 75 && marks < 90) {
            System.out.println("A+ Grade");
        }
        else if (marks >= 60 && marks < 75) {
            System.out.println("A Grade");
        }
        else if (marks >= 50 && marks < 60) {
            System.out.println("B+ Grade");
        }
        else if (marks >= 40 && marks < 50) {
            System.out.println("B Grade");
        }
        else if (marks >= 35 && marks < 40) {
            System.out.println("C Grade");
        }
        else{
            System.out.println("Fail");
        }

    }
}
