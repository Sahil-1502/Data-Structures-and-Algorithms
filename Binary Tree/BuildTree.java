import java.util.*;
import java.util.LinkedList;

public class BuildTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx =-1;
        public static Node buildtree(int nodes[]){
            idx++;
            
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            
            return newNode;
        }
    

        public static void preorder(Node root){
            if (root == null){
                System.out.print(-1+ " ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if (root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if (root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data);
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
    }

    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        // Node root = BinaryTree.buildtree(nodes);        //used this to remove warning the above 2 statement used in lecture

        // System.out.println(root.data);

        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);

        tree.levelorder(root);

        
    }
}
