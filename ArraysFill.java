import java.util.Arrays;

public class ArraysFill {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,3,5,44);
        System.out.println(Arrays.toString(arr));
    }
}
