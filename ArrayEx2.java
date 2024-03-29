import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int sum =0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
           sum+= arr[i];
        }
        System.out.println("sum of array is : "+sum);
    }
}
