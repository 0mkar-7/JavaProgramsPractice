class SumOfThreeDigits{
     public static void main(String args[])
     {
        int num = 134;
        int n1 = num%10;
        num = num/10;
        int n2 = num%10;
        num = num/10;
        int n3 = num;
        System.out.println("Sum of Three Digits = "+(n1+n2+n3));

     }
}