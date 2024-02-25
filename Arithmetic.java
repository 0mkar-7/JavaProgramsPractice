import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2 , res,ch;
        System.out.println("Enter two numbers");
            num1=sc.nextInt();
            num2=sc.nextInt();
        do{
            
            System.out.println("Select Operation \n1.Addition \n2.Substraction \n3.Multiplication \n4.Division \n5.Exit");
             ch = sc.nextInt();
            switch (ch) {
                case 1:
                    res=num1+num2;
                    System.out.println("Addition is "+res);
                    break;
                case 2:
                    res=num1-num2;
                    System.out.println("Substraction is "+res);
                    break;
                case 3:
                    res=num1*num2;
                    System.out.println("Multiplication is "+res);
                    break;
                case 4:
                    res=num1/num2;
                    System.out.println("Division is "+res);
                    break;
                case 5:
                    System.exit(0);
            
                default:
                    System.out.println("Enter a Valid Choice");
                    break;
            }
        }while(ch!=5);
    }
}
