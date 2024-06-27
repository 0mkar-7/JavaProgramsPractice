
abstract class A{
    void funOne(){
        System.out.println("funOne() of A");
    }
    abstract void funTwo();
}

public class AbstractClassEx extends A {

    void funTwo(){
        System.out.println("funTwo() of AbstractClassEx");
    }
    public static void main(String[] args) {
        //A a = new A();  You cannot create objects for abstract class.
        AbstractClassEx ab = new AbstractClassEx();
        ab.funOne();
        ab.funTwo();

    }
}
