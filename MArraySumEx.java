import java.util.Scanner;

public class MArraySumEx {
    public static void main(String[] args) {
         int arr[][] = new int[3][3];
         int sum =0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of array are ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Sum is "+sum);
    }
}
