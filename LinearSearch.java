import java.util.Scanner;

public class LinearSearch {
    public static int LSearch(int arr[] , int key){
        int index;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                index=i;
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(LSearch(arr, key));
    }
}
