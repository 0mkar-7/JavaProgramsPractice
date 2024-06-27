class Task4{
	public static void main(String args[]){
		String s1 = "Hi";
		String s2 = new String("Hello");
		String s3 = new String("Hello");

		System.out.println("Equal to Operator");
		if(s2==s3){
			System.out.println("Same");
		}
		else{
			System.out.println("Not Same");
		}

		System.out.println("Equals Functions");
		if(s2.equals(s3)){
			System.out.println("Same");
		}
		else{
			System.out.println(" Not Same");
		}
		
	}
}