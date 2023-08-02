public class LinkedList{
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

    public int iterativeSearch(int key){
        Node temp = head;
        int i =0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public int search(Node head, int key){
        //base condition 
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int next = search(head.next, key);
        if(next != -1){
            next = next+1;
        }
        return next;
    }

    public int recSearch(int key){
        return search(head,key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;   // analyse this statement
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void deleteNthfromEnd(int n){
        // claculate size 
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        //head ko hi delete karna hai
        if(n == sz){
        head = head.next;           //remove first
        return;
        }

        Node prev = head;

        int idx = sz-n;
        for(int i=1;i<idx;i++){
            prev=prev.next;
        }
        prev.next = prev.next.next;
        
    }

    public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head == tail || head == null){
            return true;
        }

        //Find Mid 
        Node mid = findMiddle(head);


        // reverse second half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        // compare left and right

        while(right!=null){
            if(left.data  !=  right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String args[]){
    LinkedList ll = new LinkedList();
    // ll.addFirst(2);
    // ll.print();
    // ll.addFirst(1);
    // ll.print();
    // ll.addLast(3);
    // ll.print();
    // ll.addLast(4);
    // ll.print();
    // // ll.addMiddle(2, 9);
    // // ll.print();
    // ll.addMiddle(0,0);
    // ll.print();

    // System.out.println(ll.size);

    // ll.removeFirst();
    // ll.print();

    // ll.removeLast();
    // ll.print();
    // // System.out.println(ll.size);
    // //1->2->3

    // // System.out.println(ll.recSearch(2));
    // // System.out.println(ll.recSearch(10));

    // //1->2->3

    // // ll.reverse();
    // // ll.print();

    // remove nth from back
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);    
    ll.addLast(4);
    ll.addLast(5);
    ll.print();
    ll.deleteNthfromEnd(2);
    ll.print();

    // // Palindrome

    // ll.removeLast();
    // ll.addLast(2);
    // ll.addLast(1);
    // ll.print();
    // System.out.println(ll.checkPalindrome());
    }

}