public class SwapNumbers {
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        System.out.println("values before swapping \n a : "+a+"\n b: "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("values after swapping \n a : " + a + "\n b: " + b);

    }
}
