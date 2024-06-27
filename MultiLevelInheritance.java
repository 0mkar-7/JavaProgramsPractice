
class A{
	String name = "JavaPrograms";
	void Method_A(){
		System.out.println("This is class A");
	}
}
class B extends A{
	int gold = 3;
	void Method_B(){
		System.out.println("This is class B");
	}
}
class C extends B{
	int cars = 2;
	void Method_C(){
		System.out.println("This is class C");
	}
}
class D extends C{
	int flats = 4;
	void Method_D(){
		System.out.println("This is class D");
	}
}

class MultiLevelInheritance{
	public static void main(String[] args) {
	 D d = new D();
	 System.out.println(d.name);
	 System.out.println(d.gold);
	 System.out.println(d.cars);
	 System.out.println(d.flats);

	 d.Method_A();
	 d.Method_B();
	 d.Method_C();
	 d.Method_D();
}
}