
// Bubble Sort compares an element with next corresponding element.
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8};
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }

        // Reverse
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[j] < arr[j+1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;

        //         }
        //     }
        // }
        

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
