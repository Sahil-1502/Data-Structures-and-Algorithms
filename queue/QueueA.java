public class QueueA {
    // implementation of queue using Linked List
    static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static  class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return (head == null && tail == null);
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = tail.next;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return Integer.MIN_VALUE;
            }
            int result = head.data;
            if(head == tail){
                head = tail = null;
            } else {
            head = head.next;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return Integer.MIN_VALUE;
            }
            return head.data;
        }
    }

    public static void main (String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}