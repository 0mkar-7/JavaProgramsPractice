public class StackImplementation {

    public static class Stack{
        private int top ;
        private int stackArray[]= new int[5];

        Stack(){
             top = -1;
        }

        void push(int val){
            if(top==stackArray.length-1){
                System.out.println("Stack is full");
                return;
            }
            top = top + 1;
            stackArray[top] = val;
        }

        void pop(){
            if(top == -1){
                System.out.println("Stack is empty");
                return;
            }
            top = top-1;
            
        }

        void displayElements(){
            if(top == -1){
                System.out.println("Stack is empty");
                return;
            }
            for(int i=top;i>=0;i--){
                System.out.println(stackArray[i]);
            }
        }

        void isFull(){
           if(top == stackArray.length-1){
                System.out.println("Stack is full");
           }
           else{
                System.out.println("Stack is not full");
           }
        }

        void isEmpty(){
            if (top==-1) {
                System.out.println("Stack id Empty");
            }
            else{
                System.out.println("Stack is not Empty");
            }
        }

        void peek(){
            if(top == -1){
                System.out.println("Stack is empty");
                return;
            }
            System.out.println(stackArray[top]);
        }

        int size(){
            return top+1;
        }


    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.displayElements();
        System.out.println();
        st.pop();
        st.displayElements();
        System.out.println();
        System.out.println(st.size());
        System.out.println();
        st.peek();
        System.out.println();
        st.isEmpty();
        System.out.println();
        st.isFull();
    }
}
