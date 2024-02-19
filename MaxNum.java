class MaxNum{
	public static void main(String[] args) {
		int a = 10 , b=20 , c=12 , d=30 , e =13;
		int max = a;
		if(max<b){
			max=b;
		}
		if(max<c){
			max=c;
		}
		if(max<d){
			max=d;
		}
		if(max<e){
			max=e;
		}
		System.out.println("Maximum Number "+max);
	}
}