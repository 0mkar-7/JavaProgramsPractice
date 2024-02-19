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
				int discount = (cost*100)/10;
				System.out.println("Cost price"+cost);
				System.out.println("Discount "+discount);
				System.out.println("Discounted Price for Student "+ (cost-discount));
			}
			else{
				int discount = (cost*100)/5;
				System.out.println("Cost price"+cost);
				System.out.println("Discount "+discount);
				System.out.println("Discounted Price for Student  "+(cost-discount));
			}
		}
		else{
			if(cost>500){
				int discount = (cost*100)/8;
				System.out.println("Cost price"+cost);
				System.out.println("Discount "+discount);
				System.out.println("Discounted Price for Non Student "+(cost-discount));
			}
			else{
				int discount = (cost*100)/2;
				System.out.println("Cost price"+cost);
				System.out.println("Discount "+discount);
				System.out.println("Discounted Price for Non Student"+(cost-discount));
			}

		}
	}
}