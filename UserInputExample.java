import java.util.*;
class UserInputExample{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		System.out.println("Enter your grade");
		char grade = sc.next().charAt(0);
		System.out.println("Enter your Fees");
		float fees = sc.nextFloat();
		System.out.println("Enter your Name");
		String name = sc.next();

		System.out.println("Your Details \n Name : "+name +" \nGrade : "+grade+"\nMarks: "+marks+" \nFees : "+fees);

	}
}