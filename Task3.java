//wap to check if number is even or odd without using % operator

class Task3{
	public static void main(String[] args){
		int a = 20;
		int num = a&1;
		if(num==1)
			{
				System.out.println("odd");
			}	
		else
			{
				System.out.println("eve");
			}

		// Using OR opertaor
		int num2 = a|1;
		if(num2 == a)
		{
			System.out.println("Odd");
		}
		else
		{
			System.out.println("Even");
		}

		//Using XOR
		int Xor_num = (a^1);
		int res = a-1;
		if(Xor_num == res){
			System.out.println("Odd");
		}
		else{
			System.out.println("Even");
		}
	}
}