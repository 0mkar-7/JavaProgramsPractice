public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int count=0;

        public void insertAtEnd(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
                tail = newNode;

            }
            else{
                tail.next = newNode;
                newNode.prev = tail;
                
            }
            tail = newNode;
            count++;
        }

        public void display(){
            Node temp = head;
            if(temp==null){
                System.out.println("List is empty");
                
            }
            else{
                while(temp != null){
                    System.out.print(temp.data + " <-> ");
                    temp = temp.next;
                }
            }
        }

        public void displayReverse(){
            Node temp = tail;
            if(temp==null){
                System.out.println("List is empty");
            }
            else{
                while(temp != null){
                    System.out.print(temp.data + " <-> ");
                    temp = temp.prev;
                }
            }
        }

        public void deleteEnd(){
            if(head == null){
                System.out.println("List is empty");
            }
            else if(head == tail){
                head = null;
                tail = null;
                
            }
            else{
                tail = tail.prev;
                tail.next = null;
            }
            count--;
        }

        public int size(){
            return count;
        }


    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        System.out.println();
        ll.display();
        System.out.println("\nNumber of Elements i Linked List are :" + ll.size());
        ll.deleteEnd();
        System.out.println();
        ll.display();
        System.out.println();
        ll.displayReverse();

        System.out.println("\nNumber of Elements i Linked List are :"+ll.size());
    }
}
