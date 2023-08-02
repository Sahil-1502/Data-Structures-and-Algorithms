import java.util.*; 
import java.util.LinkedList;

public class SumTree {
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

    // public static int sumTree(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int val = root.data;
    //     int left = sumTree(root.left);
    //     int right= sumTree(root.right);

    //     root.data = left+right;

    //     return left+right+val;
    // }

    public static int sumTree(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = sumTree(root.left);               //purane tree ka node ka value
        int rightSum = sumTree(root.right);

        // int newLeft;
        // int newRight;
        // if(root.left == null){
        //     newLeft = 0;
        // } else{
        //     newLeft = root.left.data;
        // }

        // if(root.right == null){
        //     newRight = 0;
        // } else{
        //     newRight = root.right.data;
        // }

        int newLeft = root.left==null? 0:root.left.data;            //new tree ke node ka value
        int newRight = root.right==null? 0:root.right.data;

        int data = root.data;
        root.data = leftSum+rightSum+newLeft+newRight;

        return data;
    }
    public static void levelorder(Node root){
    if (root == null){
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty()){
        Node newNode = q.remove();
        if(newNode == null){
            System.out.println();
            if(q.isEmpty()){
                break;
            } 
            q.add(null);
        } else {
            System.out.print(newNode.data + " ");
            if(newNode.left != null){
                q.add(newNode.left);
            }
            if(newNode.right != null){
                q.add(newNode.right);
            }
            
        }                
    }
    }

    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6); 
        root.right.right = new Node(7);

        sumTree(root);
        levelorder(root);
    }
}
