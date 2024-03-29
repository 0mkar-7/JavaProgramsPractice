import java.util.Arrays;

public class ArrayComparision {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] ={2,3,4};
        int arr3[] = {1,2,3};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));
    }
}
