
interface inter1{
    abstract void m1();
}
interface inter2{
    abstract void m2();
}
interface inter3{
    abstract void m3();
}




class A implements inter1 , inter2 , inter3{
    public void m1(){
        System.out.println("M1 Function of interface 1");
    }
    public void m2(){
        System.out.println("M2 Function of interface 2");
    }
    public void m3(){
        System.out.println("M3 Function of interface 3");
    }
}
public class InterfaceEx2 {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        a.m2();
        a.m3();
    }
}
