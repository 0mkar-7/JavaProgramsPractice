import java.util.*;
class Discountt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Cost Price:");
		int cost = sc.nextInt();
		System.out.println("Are you a Student?");
		String ans = sc.next();
		if(ans.equals("yes")){
			if(cost>500){
				int discount = (cost*10)/100;
				System.out.println("Cost price"+cost);
				System.out.println("Discount "+discount);
				System.out.println("Discounted Price for Student "+ (cost-discount));
			}
			else{
				int discount = (cost*5)/100;
				System.out.println("Cost price"+cost);
				System.out.println("Discount "+discount);
				System.out.println("Discounted Price for Student  "+(cost-discount));
			}
		}
		else{
			if(cost>500){
				int discount = (cost*8)/100;
				System.out.println("Cost price"+cost);
				System.out.println("Discount "+discount);
				System.out.println("Discounted Price for Non Student "+(cost-discount));
			}
			else{
				int discount = (cost*2)/100;
				System.out.println("Cost price"+cost);
				System.out.println("Discount "+discount);
				System.out.println("Discounted Price for Non Student"+(cost-discount));
			}

		}
	}
}