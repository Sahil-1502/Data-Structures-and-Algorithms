// import java.util.*;
public class ValidBST {
    

    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //leftsubtree
            root.left = insert(root.left, val);
        }else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static boolean isValid(Node root, Node min, Node max){
        if(root == null ){
            return true;
        }

        if(min != null && root.data<=min.data){
            return false;
        }
        if(max != null && root.data>=max.data){
            return false;
        }
        return isValid(root.left, min, root)
                && isValid(root.right, root, max);
    }

    public static void main(String args[]){
        // int values[] = {8,5,3,1,4,6,10,11,14};
        int values[] = {1,1,1};
        Node root = null;
        for(int i= 0; i<values.length;i++){
            root = insert(root, values[i]);
        }

        System.out.println(isValid(root, null, null));
        
    }

 
}

