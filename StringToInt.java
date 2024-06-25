public class StringToInt {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);  //parseInt Method
        System.out.println(num+1);
        System.out.println(Integer.valueOf(num+2));
        System.out.println(num);

        //Integer to String
        System.out.println("--------------------");
        int number = 123;
        String s = Integer.toString(number); //toString Method
        System.out.println(s+1);

        String str2 = String.valueOf(number);  //valueOf Method
        System.out.println(str2+"okay");

        String str3 = String.format("%d", number);  //format method
        System.out.println(str3+"hello");

        String strs = number + "";   //Empty string
        System.out.println(strs+"helllloooo");
        System.out.println("--------------------");
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1==s2);
        s1 = s1+"World";
        System.out.println(s1==s2);
        String s3 = "HelloWorld";
        System.out.println(s1==s3);

        System.out.println("--------------------");
        //String Buffer
        StringBuffer x = new StringBuffer("vivek");
        StringBuffer y = new StringBuffer("vivek");
        System.out.println(x==y);
        x=x.append("pandey");
        System.out.println(x==y);
        StringBuffer z = new StringBuffer("vivekpandey");
        System.out.println(x==z);

        System.out.println("--------------------");
        //Insert and Delete
        StringBuilder sb = new StringBuilder("Yadagiri");
        sb.insert(4,"Reddy");
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        System.out.println("--------------------");

        StringBuffer x1 = new StringBuffer("vivek");
        StringBuffer x2 = new StringBuffer("vivek");
        System.out.println(x1.capacity());
        System.out.println(x1.equals(x2));
        System.out.println(x1.compareTo(x2));


    }
}
