public class ArrayEx7 {
    public static void main(String[] args) {
        int arr[] = {22,25,43,21,18};
        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp ;
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
