public class String2 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 ="Today";

        String arr[] = str1.split("r");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
