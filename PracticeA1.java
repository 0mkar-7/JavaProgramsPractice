//program to prit sum of first and last digit

import java.util.Scanner;

public class PracticeA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int nsave = num;
        int sum =0;
        int ld = num%10;  //last digit
        while(num>10){
            
            num = num/10;
        }
        sum = ld +num;
        System.out.println("Sum is "+sum);
    }
}
