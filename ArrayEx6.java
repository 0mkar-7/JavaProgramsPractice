import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        int arr[] = {22,25,43,21,18};
        Scanner sc = new Scanner(System.in);
        int max , min ,i ;
        max = min = arr[0];
        for(i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Smallest element of array is "+min+" Largest element of array is "+max);
        
    }
}
