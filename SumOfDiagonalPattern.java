public class SumOfDiagonalPattern {
    public static void main(String[] args) {
        int i ,j, n=1,sum=0;
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                if(i==j){
                    sum+=n;
                }
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
        System.out.println("Sum of Diagonal "+sum);
    }
}
