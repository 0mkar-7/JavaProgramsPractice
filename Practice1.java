import java.util.*;
class Practice1{
	public static void main(String[] args) {
		int a , b , c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Values");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>=45 && b>=45 && c>=45){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}

	}
}