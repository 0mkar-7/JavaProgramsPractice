import java.util.*;

class percentage {
    public static void main(String[] args) {
        int a, b, c,d, e, total, per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Three Papers Max 100");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
       
        total = a + b + c +d+e;
        per = (total * 100) / 500;
       System.out.println("Percentage is "+per+"%");
    }
}