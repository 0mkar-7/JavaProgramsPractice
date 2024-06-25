class StringFunctions{
	public static void main(String[] args){
		String str1 = "Hello World";
		String str2 = "World";

		System.out.println("Length "+str1.length());
		System.out.println("Character At 1: "+str1.charAt(1) );
		System.out.println("Split "+str1.split(" "));
		System.out.println("Equals : "+str1.equals(str2));
		System.out.println("Compare TO : "+str1.compareTo(str2));
		System.out.println("Uppercase : "+str1.toUpperCase());
		System.out.println("LowerCase : "+str1.toLowerCase());
		System.out.println("IndexOf : "+str1.indexOf("H"));

	}
}