
import java.util.Scanner;

public class NestedSwitch {
    static Scanner sc = new Scanner(System.in);


    public static void breakfast(){
        int ch2;
        System.out.println("What would you have for breakfast?");
        
        do{
            System.out.println("\n1.Dosa \n2.Sandwich \n3.Idli \n4.Omlette \n5.Back To Main Menu");
            ch2 = sc.nextInt();
            switch (ch2) {
                case 1:
                    System.out.println("You Ordered Dosa!");
                    break;
                case 2:
                    System.out.println("You Ordered Sandwich!");
                    break;
                case 3:
                    System.out.println("You Ordered Idli!");
                    break;
                case 4:
                    System.out.println("You Ordered Omlette!");
                    break;
                case 5:
                    System.out.println("Going Back to Main Menu");
                    MainMenu();
            
                default:
                    System.out.println("Invalid Choice");

            }
        }while(ch2!=5);
        
    }
    
    public static void lunch() {
        int ch2;
        System.out.println("What would you have for Lunch?");

        do {
            System.out.println("\n1.Rice Plate \n2.Veg Fried Rice \n3.Panner Tikka \n4.Veg Biryani \n5.Back To Main Menu");
            ch2 = sc.nextInt();
            switch (ch2) {
                case 1:
                    System.out.println("You Ordered Rice Plate!");
                    break;
                case 2:
                    System.out.println("You Ordered Veg Fried Rice!");
                    break;
                case 3:
                    System.out.println("You Ordered Panner Tikka!");
                    break;
                case 4:
                    System.out.println("You Ordered Veg Biryani!");
                    break;
                case 5:
                    System.out.println("Going Back to Main Menu");
                    MainMenu();

                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch2 != 5);
    }
    
    public static void teaAndCoffee() {
        int ch2;
        System.out.println("What would you prefer from the following?");

        do {
            System.out.println("\n1.Tea \n2.Coffee \n3.Cold Coffee \n4.Chocolate Shake \n5.Back To Main Menu");
            ch2 = sc.nextInt();
            switch (ch2) {
                case 1:
                    System.out.println("You Ordered Tea!");
                    break;
                case 2:
                    System.out.println("You Ordered Coffee!");
                    break;
                case 3:
                    System.out.println("You Ordered Cold Coffee!");
                    break;
                case 4:
                    System.out.println("You Ordered Chocolate Shake!");
                    break;
                case 5:
                    System.out.println("Going Back to Main Menu");
                    MainMenu();

                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch2 != 5);
    }
    
    public static void beverages() {
        int ch2;
        System.out.println("What would you like to have?");

        do {
            System.out.println("\n1.Sprite \n2.Mirinda \n3.Mojito \n4.ThumsUp \n5.Back To Main Menu");
            ch2 = sc.nextInt();
            switch (ch2) {
                case 1:
                    System.out.println("You Ordered Sprite!");
                    break;
                case 2:
                    System.out.println("You Ordered Mirinda!");
                    break;
                case 3:
                    System.out.println("You Ordered Mojito!");
                    break;
                case 4:
                    System.out.println("You Ordered ThumsUp!");
                    break;
                case 5:
                    System.out.println("Going Back to Main Menu");
                    MainMenu();

                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch2 != 5);
    }

    public static void MainMenu(){
        int ch1;
        do {
            System.out.println("\n1.Breakfast \n2.Lunch \n3.Tea and Coffee \n4.Beverages \n5.Exit");
            ch1 = sc.nextInt();
            switch (ch1) {
                case 1:
                    breakfast();
                    break;
                case 2:
                    lunch();
                    break;
                case 3:
                    teaAndCoffee();
                    break;
                case 4:
                    beverages();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter Correct Option");
            }
        } while (ch1 != 4);
    }
    public static void main(String[] args) {
        
        System.out.println("Welcome to Our Restaurant ! What would you like to have");
       try{
             MainMenu();
       }
       catch(Exception e){
            System.out.println("Error Occured");
       }
       finally{
            System.out.println("Thank You for Visiting");
       }
        
    }
}
