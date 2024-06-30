public class LinkedListStack {

    private Node head; 
    private int top; 
    private int maxSize = 4;
    
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public LinkedListStack() {
        head = null;
        top = -1;
    }

    
    public void push(int data) {
        if(top == maxSize){
            System.out.println("Stack is full");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        top++;
        System.out.println("Inserting " + data);
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Or handle the underflow case appropriately
        }
        int poppedData = head.data;
        head = head.next;
        top--;
        return poppedData;
    }

    
    public boolean isEmpty() {
        return head == null;
    }

    
    public int getSize() {
        return top + 1;
    }

    
    public void printStack() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void peep(){
        if(head == null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Element at top is : "+head.data);
        
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.print("Stack: ");
        stack.printStack();

        stack.pop();
        System.out.println("After popping out:");
        stack.printStack();

        stack.peep();

        System.out.print("\n"+stack.isEmpty());


    }
}
