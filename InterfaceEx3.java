interface A{
    abstract public void m1();
    abstract public void m2();
}


//Can interface Extend Interface? --- Yes
 //interface A2 extends A{} 

 //Can Interface Extend Abstract class--NO
 //interface A2 extends B{}

 //Can Interface Extend Class?  ---No
 //interface A2 extends C{}

 //Can Interface implement Interface?  -- No
 //interface A2 implements A{}

 //Can Interface implements abstract class -- No
 //Can Interface implement class -- No

abstract class B implements A{
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
