public class ReverseNumber {
    public static void main(String args[]){
        //program for without using loop;
        int num = 2043;
        int n1,n2,n3,n4;
        n1 = num%10;
        num = num/10;
        n2 = num%10;
        num = num/10;
        n3=num%10;
        num=num/10;
        n4=num;
        int rev = n1*1000+n2*100+n3*10+n4;
        System.out.println("Reversed Number is: "+rev);
        
    }
}
