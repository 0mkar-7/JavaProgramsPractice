public class SwapNumbersWoThird {
    public static void main(String args[]){
        System.out.println("Program To Swap Two Numbers Without Using Third Variable");
        int a = 33;
        int b = 45;
        System.out.println("values before swapping \n a : " + a + "\n b: " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("values after swapping \n a : " + a + "\n b: " + b);
    }
}
