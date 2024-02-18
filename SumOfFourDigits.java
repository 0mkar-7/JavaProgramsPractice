public class SumOfFourDigits {
    public static void main(String args[]){
        int num = 2353;
        int n1 = num%10;
        num= num/10;
        int n2 = num%10;
        num = num/10;
        int n3 = num%10;
        num = num/10;
        int n4 = num;
        System.out.println("sum of all digits is "+ (n1+n2+n3+n4));

    }
}
