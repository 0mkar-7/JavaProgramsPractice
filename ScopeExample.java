class ParentClass1{

     //final void greet()   ---will throw error..
     //static void greet()  -----Static methods cannot be overridden
     // void greet()  -----Parent class protected can work 
     //Both class protected can also work
     public void greet()
    {
        System.out.println("Hello");
    }
}

class ChildClass1 extends ParentClass1{
     //protected void greet() ----  Error as we cannot reduce 
     public void greet(){
        System.out.println("Hello from Child class!");
    }
}

public class ScopeExample {
    
    public static void main(String[] args) {
        ParentClass1 obj = new ChildClass1();
        obj.greet();

        

        


    }
}
