public class DoubleLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        } 
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        // corner cases
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void print(){
        Node temp = head;
        // System.out.println(temp.data);
        // System.out.println(temp.next.data);
        // System.out.println(temp.next.next.data);
        // System.out.println(temp.next.next.next.data);
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
        
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("LL doesn't contain any element");
            return Integer.MIN_VALUE;
        }
        if(size == 1){       //head.next == null
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev=null;
        size--;
        return val;
    }

    public void reverseDLL(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){

            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr= next;

        }
        head = prev;
    }



    public static void main(String args[]){
        DoubleLL ll = new DoubleLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        // ll.print();
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);

        ll.print();
        ll.reverseDLL();
        ll.print();

    }
}
