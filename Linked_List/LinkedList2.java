public class LinkedList2{
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size =0;

    public void addFirst(int data) {
        //step 1 create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            //idhar newNode.next ko null ko kyu point nahi kiya 
            //Because by default it points to null
            return;
        }
        

        //step2 newNode next -> head
        newNode.next = head;     //head is pointing to previous starting node

        //step 3 - head = newNode
        head = newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        
        tail = newNode;


    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int idx, int data){
        if(idx == 0 ){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        for(int i=0;i<idx-1;i++){
            temp = temp.next;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        // prev = i = size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail=prev;
        size--;
        return val;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){

        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if (cycle == false){
            return;
        }

        // find meeting point
        slow = head; 
        Node prev = null;
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        // remove cycle 
        prev.next = null;
        
    }

    public static void main(String args[]){
        // LINKED LIST -II

    //isCycle
    head = new Node(1);
    Node temp = new Node(2);
    head.next = temp;
    head.next.next = new Node(3);
    head.next.next.next = temp;
    //1->2->3->2

    System.out.println(isCycle()); 
    removeCycle();
    System.out.println(isCycle()); 

    }
}