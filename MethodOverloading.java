class MethodOverloading{

	void Hi(int x){
		System.out.println("hi "+x);
	}

	void Hi(){
		System.out.println("hello");
	}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.Hi(10);
		m.Hi();
	}
}