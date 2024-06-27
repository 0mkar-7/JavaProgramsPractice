interface A{
    abstract public void m1();
    abstract public void m2();
}


//Can interface Extend Interface --- Yes
 interface A2 extends A{}

abstract class B implements A2{
    abstract  public void m1(); 
    abstract public void m2();
}

class C extends B{
    public void m1(){
        System.out.println("Hello from M1 function");

    }
    public void m2(){
        System.out.println("Hello from M2 function");
    }
}

public class InterfaceEx3 {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
        c.m2();
    }
}
