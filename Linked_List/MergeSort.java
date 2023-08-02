public class MergeSort {
    

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

    public Node mergeSort(Node head){
        // base condition
        if(head == null || head.next == null){   
            return head;
        }
        //kaam  find mid
        Node mid = getMid(head);

        Node Right = mid.next;
        mid.next = null;
        // Node Left = head;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(Right);

        return merge(newLeft, newRight);
    }



    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    private Node merge(Node Lh, Node Rh){
        Node MergedLL = new Node(-1);
        Node temp = MergedLL;
        // Node Lh = Lefthead;
        // Node Rh = Righthead;

        while(Lh != null && Rh != null){
            if(Lh.data<=Rh.data){
                temp.next=Lh;
                Lh=Lh.next;
                temp = temp.next;
            } else {
                temp.next = Rh;
                Rh=Rh.next;
                temp = temp.next;
            }
        } 
        while(Lh != null){
            temp.next = Lh;
            Lh = Lh.next;
            temp = temp.next;
        }
        while(Rh !=null){
            temp.next = Rh;
            Rh=Rh.next;
            temp = temp.next;
        }
        return MergedLL.next;
    }

    public static void main(String args[]){
        MergeSort ll = new MergeSort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        // 5->4->3->2->1
        
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
        
    }

}