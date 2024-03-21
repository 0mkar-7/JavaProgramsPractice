public class Pattern3 {
    public static void main(String[] args) {
        int i ,j, n=65;
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                System.out.print((char)n);
                n++;
            }
            System.out.println();
        }
    }
}


// ABCD
// EFGH
// IJKL
// MNOP