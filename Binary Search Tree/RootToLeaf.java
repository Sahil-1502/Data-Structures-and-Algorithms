import java.util.*;
public class RootToLeaf {
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

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+ "->");
        }
        System.out.println("null");
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }
        path.add(root.data);
        if(root.right == null && root.left == null){
            printPath(path);
            path.remove(path.size()-1);
            return;
        }

        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);

        path.remove(path.size()-1);
        return;
    }

    // public static void roottoLeaf2(Node root, ArrayList<Integer> path){
    //     if(root == null){
    //         return;
    //     }
    //     if(root.data>)
    // }

    public static void main(String args[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i= 0; i<values.length;i++){
            root = insert(root, values[i]);
        }

        // ArrayList<Node> path = new ArrayList<>();

        rootToLeaf(root, new ArrayList<>());
    }
}