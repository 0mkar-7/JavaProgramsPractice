public class InnerClassExample {
    static class Student {
        String name ;
        int rollNum;
    }

    public static void change(int x){
        x = 20;
        
    }

    public static void change(Student x){
        x.name ="rahul";
    }

    public static void main(String[] args) {

        //InnerClass Example
        Student s = new Student();
        s.name = "Omkar";
        s.rollNum=20;
        System.out.println(s.name);
        System.out.println(s.rollNum);


        //Call by Value
        int x = 10;
        System.out.println(x);
        change(x);
        System.out.println(x);

        //Call by Reference
        change(s);
        System.out.println(s.name);



        
    }
}
