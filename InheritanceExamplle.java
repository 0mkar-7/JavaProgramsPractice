class A{
	int gold = 2;
	String assets = "cars";
	int bankBalance = 2;

	void method_A(){
		System.out.println("Parent");
	}
}

class B extends A{

	int Bike = 2;
	String flats = "Mumbai";
	void method_B(){
		System.out.println("Child");
	}
}

class InheritanceExample{
	public static void main(String[] args) {
		B b = new B();
		b.method_A();
		b.method_B();
		System.out.println(b.gold+" "+b.assets+" "+b.flats);

	}
}