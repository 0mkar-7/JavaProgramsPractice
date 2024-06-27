abstract class Hotel{
    abstract void Order1();
    abstract void Order2();
    abstract void Order3();
    abstract void Order4();
    abstract void Order5();
}

class Chef extends Hotel{
    void Order1(){
        System.out.println(" Order 1 : Samosa");
    }
    void Order2(){
        System.out.println(" Order 2 : Pakoda");
    }
    void Order3(){
        System.out.println(" Order 3 : PavBhaji");
    }
    void Order4(){
        System.out.println(" Order 4 : VadaPav");
    }
    void Order5(){
        System.out.println(" Order 5 : Burger");
    }
}

public class RestaurantAbstract {
    public static void main(String[] args) {
        Chef c = new Chef();
        c.Order1();
        c.Order2();
        c.Order3();
        c.Order4();
        c.Order5();
    }
}
