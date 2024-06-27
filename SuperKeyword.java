class A{
	void printGreet(){
		System.out.println("Hello from Parent class");
	}
	A(){
		System.out.println("Parent Class Constructor");
	}
}
class B extends A{

	B(){
		super();
		System.out.println("Child class Constructor");
	}
	void printGreet(){
		super.printGreet();
		System.out.println("Hello from Child class");
		
	}
}

class SuperKeyword{
	public static void main(String[] args) {
		B b = new B();
		b.printGreet();
	}
}