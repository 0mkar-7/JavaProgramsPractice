public class LinkedListImplementation {

    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
        }
    }

    
    public static class LinkedList{
        Node head= null;
        Node tail = null;
        

        

      
        void insertAtEnd(int val){
            Node newNode = new Node(val);
            //check if linked list is empty
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            // else if linked list is nt empty
            else{  
                tail.next = newNode;
            }
            tail = newNode;
            
        }
        
        void display() {
            Node temp = head;
            if(temp == null){
                System.out.println("Linked List is Empty");
            }
            else{
                System.out.println();
                while (temp != null) {
                    System.out.print(temp.data + " ->");
                    temp = temp.next;
                }
            }

        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            // System.out.print("\nSize is : ");
            return count;
        }

        void insertAtBegining(int val){
            Node newNode = new Node(val);
            if(head==null){
                head = newNode;
                tail = newNode;
            }
            else{
                newNode.next = head;
                head = newNode;
                
            }
        }

        void deleteAt(int index){
            if(index==0){
                head = head.next;
                return;
            }
            Node temp = head;
            for(int i=1;i<index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }

        void insertAt(int index , int val){
            Node newNode = new Node(val);
            if(head==null){
                head = newNode;
                tail = newNode;
            }
            else if(index==0){
                insertAtBegining(val);
                return;
            }
            else if(index == size()+1){
                insertAtEnd(val);
                return;
            }
            else if(index<0){
                System.out.println("\nIndex is invalid");
            }
            else{
                Node temp = head ;
                for(int i = 1; i<index-1;i++){
                   temp = temp.next; 
                }
                newNode.next = temp.next;
                temp.next = newNode;
                
            }
        }
    }
    
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.insertAtEnd(1);
        LL.insertAtEnd(23);
        LL.insertAtEnd(35);
        LL.insertAtEnd(75);
        LL.display();
       System.out.println(LL.size());

       LL.insertAtBegining(37);
       LL.display();
       LL.insertAtEnd(20);
       LL.display();

       LL.insertAt(3, 800);
       LL.display();

       LL.insertAt(0, 9);
       LL.display();

       LL.insertAt(8, 88);
       LL.display();

       LL.deleteAt(3);
       LL.display();


    }
}
