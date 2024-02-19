import java.util.*;
class Notes{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int amt , range , n1;
		System.out.println("Enter amount");
		amt = sc.nextInt();
		System.out.println("Enter Range ");
		range = sc.nextInt();
		switch(range){
			case 2000 :
				n1=amt/2000;
				System.out.println("2000 *"+n1);
				amt=amt%2000;
			case 500 :
				n1=amt/500;
				System.out.println("500 *"+n1);
				amt=amt%500;
			case 200 :
				n1=amt/200;
				System.out.println("200 *"+n1);
				amt=amt%200;
			case 100 :
				n1=amt/100;
				System.out.println("100 *"+n1);
				amt=amt%100;
			case 50 :
				n1=amt/50;
				System.out.println("50 *"+n1);
				amt=amt%50;
			case 20 :
				n1=amt/20;
				System.out.println("20 *"+n1);
				amt=amt%20;
			case 10 :
				n1=amt/10;
				System.out.println("10 *"+n1);
				amt=amt%10;
			case 5 :
				n1=amt/5;
				System.out.println("5 *"+n1);
				amt=amt%5;
			case 2 :
				n1=amt/2;
				System.out.println("2 *"+n1);
				amt=amt%2;
			case 1 :
				n1=amt/1;
				System.out.println("1 *"+n1);
				amt=amt%1;
				break;
			default: 
				System.out.println("Invalid Notes Range");
		}

	}
}