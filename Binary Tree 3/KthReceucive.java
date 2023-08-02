public class KthReceucive {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void Kthreceucive(Node root, int currLevel, int target){
        if(root == null){
            return;
        }
        if(currLevel == target){
            System.out.print(root.data + " ");
            return;                 // no need to go further down
        }
        Kthreceucive(root.left,currLevel +1 ,target);
        Kthreceucive(root.right,currLevel +1 ,target);
    }


    public static void main(String arsg[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6); 
        root.right.right = new Node(7);

        Kthreceucive(root, 1, 3);
    }
}
