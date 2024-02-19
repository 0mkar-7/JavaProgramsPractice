import java.util.*;
class CheckDay{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day in format mon or tue..");
		String day = sc.next();
		if(day.equals("sun") || day.equals("sat")){
			System.out.println("It's Weekend day");
		}
		else{
			System.out.println("It's Week day");
		}
	}
}