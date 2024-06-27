class A{
	int rank = 1;
	int age = 40;
	String name = "Java";
	int members = 3;
	int salary = 40;

	A(){
		System.out.println("Constructor of Parent Class");
	}
}
class B extends A{
	int age = 15;
	int cars = 1;
	int flats = 2;
	String award = "Brave";
	int parties = 12;

	B(){
		super();
		System.out.println("Constructor of Child Class");
	}
}


class SuperTask{
	public static void main(String[] args) {
		B b = new B();
		
	}
}