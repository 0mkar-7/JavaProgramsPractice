//Insertion Sort

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={8,9,5,7,4,10};

        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
