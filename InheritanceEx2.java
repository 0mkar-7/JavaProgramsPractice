class Shape{
	String name = "shape";
	void printShape(){
		System.out.println("This is Shape class");
	}
}
class CircleOne extends Shape{
	int uid = 2;
	void Method_1(){
		System.out.println("This is Circle One Class");
	}
}


class Circle2 extends Shape {
	void Method_2(){
		System.out.println("This is Circle Two class");
	}
}

class Pentagon extends CircleOne{
	void Method_4(){
		System.out.println("This is Child1 of Circle 1 class");
	}
}
class Pentagon2 extends CircleOne{
	void Method_5(){
		System.out.println("This is child2 of Circle class");
	}
}

class Star extends Circle2{
	void Method_6(){
		System.out.println("This is Child of Circle2 class");
	}
}

class Heart extends Star{
	void Method_7(){
		System.out.println("This is Child of Star Class");
	}
}

class InheritanceEx2{
	public static void main(String[] args) {
		Pentagon2 p = new Pentagon2();
		Pentagon p2= new Pentagon();
		Heart h = new Heart();



		System.out.println(p.uid);
		h.Method_6();
	}
}