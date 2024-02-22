import java.util.*;
class CheckVowel{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char c = sc.next().charAt(0);
		switch (c) {
			case 'a':
				System.out.println("Character is vowel ");
				break;
			case 'e':
				System.out.println("Character is vowel ");
				break;
			case 'i':
				System.out.println("Character is vowel ");
				break;
			case 'o':
				System.out.println("Character is vowel ");
				break;
			case 'u':
				System.out.println("Character is vowel ");
				break;
		
			default:
				System.out.println("Character is Not a Vowel ");
				break;
		}
		
	}
}