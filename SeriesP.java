public class SeriesP {
    public static void main(String[] args) {
        int sum =0;
        int num = 2;
        for(int i=1;i<=10;i++){
            
            sum = (num*i)+i;   //1*1+1
            System.out.print(sum+" ");
            num = sum;

        }
    }
}
