import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Restaurant ! What would you like to have?");
        int ch;
        do{
            System.out.println("\n\n\n1.Tea \n2.Dosa \n3.Idli \n4.Wadapav \n5.Pizza \n6.Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("\n\tYou Ordered Tea!");
                    break;
                case 2:
                    System.out.println("\n\tYou Ordered Dosa!");
                    break;
                case 3:
                    System.out.println("\n\tYou Ordered Idli!");
                    break;
                case 4:
                    System.out.println("\n\tYou Ordered Wadapav!");
                    break;
                case 5:
                    System.out.println("\n\tYou Ordered Pizza!");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Item not Available ! Please order Something Else...");
            }
        }
        while(ch!=6);
            
    }
}
