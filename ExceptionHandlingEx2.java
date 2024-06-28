class A{
	 int i =10;
	 void m1(){
		System.out.println("m1 function");


	}    
	throw new IOException("my own Exception");
}


class ExceptionHandlingEx2{

	public static void main(String[] args) {
		A a = null;
		a.m1();
		System.out.println(a.i);

	}
}