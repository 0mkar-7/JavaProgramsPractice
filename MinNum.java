class MinNum{
	public static void main(String[] args) {
		int a = 10 , b=20 , c=12 , d=30 , e =13;
		int min = a;
		if(min>b){
			min=b;
		}
		if(min>c){
			min=c;
		}
		if(min>d){
			min=d;
		}
		if(min>e){
			min=e;
		}
		System.out.println("Minimum Number "+min);
	}
}