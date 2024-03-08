//program to print palindrome numbers till n
public class PalindromeN {
    public static void main(String[] args) {
        int rem;
        for(int i=0;i<=999;i++){
            int rev =0;
            int num = i;
            int numSave = num;
            while (num > 0) {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            if (rev == numSave) {
                System.out.println(numSave + " ");
            }
        }
    }
}
