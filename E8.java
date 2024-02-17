class Test{
	public void show(){
		System.out.println("Inside Test Class Show Method");
	}
	static int a=10;
	static void sample(){
		System.out.println("Value of a "+a);
	}
}
class E8{
	

	public static void main(String args[]){
		System.out.println("Inside Main Method");
		new Test().sample();
		new Test().show();
	}
}