public class LinkedList1 {
    public static class Node {
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node temp){
        System.out.println("--------------------------------");
        System.out.println("While Loop Function");
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node d = new Node(10);
        Node a = new Node(9);
        Node b = new Node(8);
        Node c = new Node(5);
        Node f = new Node(7);
        Node e = new Node(100);

        System.out.print(d+" ");
        System.out.print(d.data+" ");
        
        d.next = a;
        System.out.print(d.next+" ");
        System.out.println();

        System.out.print(a+" ");
        System.out.print(a.data+" ");
        a.next = b;
        System.out.print(a.next+" ");
        System.out.println();

        System.out.print(b+ " ");
        System.out.print(b.data+" ");
        b.next = c;
        System.out.print(b.next+" ");
        System.out.println();

        System.out.print(c+" ");
        System.out.print(c.data+" ");
        c.next = e;
        System.out.print(c.next+" ");
        System.out.println();

        System.out.print(e+" ");
        System.out.print(e.data+" ");
        e.next = f;
        System.out.print(e.next+" ");
        System.out.println();

        System.out.print(f+" ");
        System.out.print(f.data+" ");
        System.out.print(f.next+" ");
        System.out.println();

        System.out.println(a.next.next.next.next.data);


        System.out.println("------------------------------");
        Node temp = a;
        for(int i=0;i<5;i++){
            System.out.println(temp.data);
            temp=temp.next;
        }


        display(d);



       
        
        
    }
}
