class ExceptionHandlingEx{
	public static void main(String[] args) {
		int x = 10;
		try{
			int rem = x/0;
			System.out.println(rem);
		}
		catch(Exception e){
			System.out.println("Error occurred : ");
		}
		finally{
			System.out.println("finally block");
		}
	}
}