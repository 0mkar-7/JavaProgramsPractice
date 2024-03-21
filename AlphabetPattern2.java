public class AlphabetPattern2 {
    public static void main(String[] args) {
        int i , num =65 ,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=5;j++){
                System.out.print((char)num);
                num++;
            }
            System.out.println();
            num=65;
        }
    }
}


// ABCDE
// ABCDE
// ABCDE
// ABCDE