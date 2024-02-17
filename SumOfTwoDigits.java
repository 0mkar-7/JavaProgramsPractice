class SumOfTwoDigits{
	public static void main(String args[]){
		int number = 22;
		int n1 = number%10;
		number = number/10;
		int n2 = number%10;
		int sum = n1+n2;
		System.out.println("Sum of Digits "+sum);
	}
}