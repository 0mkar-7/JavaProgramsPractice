//Program to print armstrong numbers till 10k
public class ArmstrongN {
    public static void main(String[] args) {
        int num ,rem;
        for(int i=0;i<=10000;i++){
            int count = 0,sum =0;
            num = i;
            int numSave = num;

            while (num > 0) {
                num = num / 10;
                count++;

            }
            num = numSave;
            while (num > 0) {
                rem = num % 10;
                sum += (Math.pow(rem, count));
                num = num / 10;

            }

            if (sum == numSave) {
                System.out.println(numSave + " ");

            }
        }
    }
}
