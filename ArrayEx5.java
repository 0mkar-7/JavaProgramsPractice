import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int sum = 0;
            int arr[] = new int[5];
            System.out.println("Enter elements of array ");
            for(int i=0;i<arr.length;i++){
                arr[i]= sc.nextInt();
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    sum += arr[i];
                }
            }
            System.out.println(" Sum of Even ELements is " + sum);
    }
}
