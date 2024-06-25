import java.util.Scanner;

public class RestaurantFullStack {

    public static void fiftyOddNums(){
        
        System.out.println("First 50 odd Numbers");
        for(int i=0;i<=100;i++){
            
                if(i%2!=0){
                    System.out.print(i+" ");
                    
                }
            }
            
        }
    

    public static void firstTenSquares(){
        System.out.println("First 10 square Numbers");
        int i=1;
        while(i<=10){
            System.out.print(i*i+" ");
            i++;
        }
    }

    public static void first20Cubes(){
        System.out.println("First 20 cube Numbers");
        int i=1;
        do{
            System.out.print(i*i*i+" ");
            i++;
        }
        while(i<20);
    }

    public static void skipEven(){
        System.out.println("Use Of continue keyword");
        for(int i=1;i<=10;i++){
            if(i<2 || i%2==0){
                continue;
            }
            else{
                System.out.print(i+" ");
            }
        }
    }

    public static void breakLoop(){
        System.out.println("Use of break");
        for(int i=0;i<=10;i++){
            if(i==5){
                break;
            }
            else{
                System.out.print(i+" ");
            }
        }
    }

    
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int ch ;
        do{
            System.out.println("\n\n\n1.Print first 50 odd Numbers \n2.First 10 square numbers \n3.First 20 cubes \n4.Skip Even \n5.Break Loop \n6.Exit");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    fiftyOddNums();
                    break;
                case 2:
                    firstTenSquares();
                    break;
                case 3:
                    first20Cubes();
                    break;
                case 4:
                    skipEven();
                    break;
                case 5:
                    breakLoop();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Wrong Input!");
            }


        }
        while(ch!=6);
    }
}
