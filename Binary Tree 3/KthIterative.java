import java.util.*;
import java.util.LinkedList;
public class KthIterative{

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

    public static void levelOrder(Node root, int k){
        Queue <Node> q = new LinkedList<>();
        int level =2;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node newNode = q.remove();
            if(newNode == null){
                if(q.isEmpty()){
                    break;
                }
                level++;
                q.add(null);
            } else {
            if (level == k){  
                System.out.print(newNode.data +" ");
            }
                if(root.left != null){
                    q.add(root.left);
                }
                if(root.right != null){
                    q.add(root.right);
                }
            }
        }
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        levelOrder(root, 1);

    }
}