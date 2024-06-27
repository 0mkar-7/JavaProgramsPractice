public class Oops1 {
    int a ;   //static 
    String s ;

    static int r = 30; //static variable (can be used without creating objects)

    //Non static method
    void hi(){
        System.out.println("hi");
    }

    //Static method
    static void hello(){
        System.out.println("hello");
    }

    //method to call another methods
    static void greet(){
        Oops1 op = new Oops1();
        op.hi();
        hello();
    }
    public static void main(String[] args) {
        int b=10;
        Oops1 op = new Oops1();
        System.out.println(b);

        //this line will cause error
       // System.out.println(a);  
       
       System.out.println(op.a);
       System.out.println(op.s);
       System.out.println(r);
       hello();   //static method can be called without objects
       op.hi();
       greet();
       
    }
}
