//First Select the smallest element index , then sort it accordingly

public class SelectionSort {
    public static void main(String[] args) {
        int minIndex;
        int[] arr = { 5, 2, 4, 6, 1};
        for(int i=0;i<arr.length-1;i++){
            minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
        
    }
}
