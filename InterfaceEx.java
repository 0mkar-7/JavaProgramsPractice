interface ExampleA{
    int x = 10;
    abstract void Hello();
    abstract void Hi();
}
class A implements ExampleA{
    public void Hello(){
        System.out.println("Hello");
    }

    public void Hi(){
        System.out.println("Hi");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        
        A a = new A();
        a.Hello();
        a.Hi();
        System.out.println(a.x);
        System.out.println(ExampleA.x);
        
    }
}
