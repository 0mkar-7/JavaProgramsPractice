public class SumOfRowPattern {
    public static void main(String[] args) {
        int i ,j, n=1,sum=0;
        for(i=1;i<=4;i++){
            sum=0;
            for(j=1;j<=4;j++){
               
                System.out.print(n+" ");
                sum+=n;
                n++;
                
                
            }
            System.out.println("       -> "+sum);
            System.out.println();
        }
        
    }
}


// 1 2 3 4        -> 10

// 5 6 7 8        -> 26

// 9 10 11 12        -> 42

// 13 14 15 16        -> 58