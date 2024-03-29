import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int arr1[] = {2,31,43,21,98,21};
        int arr2[] = Arrays.copyOf(arr1, 6);
        int arr3[] = new int[10];
        System.out.println(Arrays.toString(arr2));
        System.arraycopy(arr2, 0, arr3, 0, 6);
        System.out.println(Arrays.toString(arr3));
    }
}
