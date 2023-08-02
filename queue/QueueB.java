public class QueueB {
    //implementation using array
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        public Queue(int n){
            arr = new int[n];
            size =n;
            rear =-1;             //initially ek bhi element nahi hai
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is Empty");
                return Integer.MIN_VALUE;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear = rear -1;
            return front;
        }

        public static int peak(){
            if(isEmpty()){
                System.out.println("queue is Empty");
                return Integer.MIN_VALUE;
            }
            return arr[0];  
        }
    }

    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peak());
            q.remove();
        }
    }
}
