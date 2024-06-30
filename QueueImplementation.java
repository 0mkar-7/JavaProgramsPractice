public class QueueImplementation {

    public static class Queue{
        private int SIZE = 5;
        private int[] queue= new int[SIZE];
        private int front , rear;
        

        public Queue(){
           front =  -1;
           rear = -1;
        }

        public boolean isFull(){
            if(rear == SIZE-1)
                return true;
            return false;
        }

        public boolean isEmpty(){
            if(front == -1 || front > rear)
                return true;
            return false;
        }

        public void display(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            else{
                System.out.println();
                for(int i =front ;i<=rear;i++){
                    System.out.print(queue[i]+" ");

                }
            }         
        }

        public void enqueue(int val){
            if(isFull()){
                System.out.println("Queue is full");
            }
            else if(front == -1){
                
                    front ++;
                    rear++;
                    queue[rear] = val;
                    System.out.println("\n Inserted value : "+val);
                    
            }
            else{
                rear++;
                queue[rear] = val;
                System.out.println("\n Inserted value : "+val);
               
            }
        }

        public void dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            else if(front==rear){
                int deletedElement = queue[rear];
                front = -1;
                rear = -1;
                System.out.println("\n Deleted Element : "+deletedElement);
            }
            else{
                int deletedElement = queue[front];
                front++;
                for(int i=front;i<=rear;i++){
                    queue[i-1] = queue[i];
                }
                System.out.println("\n Deleted Element : " + deletedElement);
                front --;
                rear--;

            }
        }

        public void getCount(){
            if(isEmpty()){
                System.out.println("Number of Elemens in queue are 0");
            }
            else if(isFull()){
                System.out.println("Number of Elemens in queue are 5");
            }
            else{
                int count =0;
                for(int i=front;i<=rear;i++){
                    count++;
                }
                System.out.println("Number of Elemens in queue are "+count);
            }
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        q.dequeue();
        q.display();
        System.out.println();
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
        System.out.println();
        q.getCount();
        q.dequeue();
        q.dequeue();
        q.getCount();
    }
}
