import java.util.*;
class Practice2{
	public static void main(String[] args) {
		int a , b , c , total , per ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of Three Papers Max 100");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("Enter Gender : Enter male or female");
		String gender = sc.next();
		total = a+b+c;
		per = (total*100)/300;
		if(per>=62 && gender.equals("female")){
			System.out.println("She Can Take Admission");
		}
		else{
			System.out.println("She Cannot Take Admission");
		}
	}
}