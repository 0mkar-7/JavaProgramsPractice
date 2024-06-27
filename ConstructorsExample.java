public class ConstructorsExample {

    ConstructorsExample(){
        System.out.println("Non-Parameterized Constructor");
    }

    ConstructorsExample(int x){
        this();
        System.out.println("Parameterized Constructor");
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        ConstructorsExample obj = new ConstructorsExample(10);
        System.out.println("Hello World!");
        
    }
}
