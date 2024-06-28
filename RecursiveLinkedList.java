

public class RecursiveLinkedList {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;   
        }
    }

    //Recursive function to print Linked List
    public static void display(Node temp){
       if(temp==null)
            return;
        System.out.print(temp.data+"->");
        display(temp.next);  //Recursive call
    }

    public static void reverseDisplay(Node temp){
        if(temp==null)
            return;
        System.out.println(temp.data+"  ->");
        reverseDisplay(temp.next);
    }

    public static void countNodes(Node temp){
        int count  = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
            
        }
        System.out.println("\nNumber of nodes in the linked list is "+count);
    }

    




    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        n1.next=n2;
        Node n3 = new Node(30);
        n2.next=n3;

        display(n1);
        countNodes(n1);
        
    }
}
