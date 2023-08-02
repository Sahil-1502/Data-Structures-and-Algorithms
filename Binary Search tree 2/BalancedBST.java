import java.util.*;
public class BalancedBST{

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
    //individual wala question sorted array to BST
    public static Node createBST(int arr[], int si, int ei){
        if(si>ei){
            return null;
        }
        int mid = si +(ei-si)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, si, mid-1);
        root.right = createBST(arr, mid+1, ei);

        return root;
    }

    //driver function for BT to BST
    public static Node mainBalancedBST(Node root){ //O(n)
        //sorted inorder -O(n)
        ArrayList<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);

        //sorted acending orders O(n)
        root = balancedBST(inorder, 0, inorder.size()-1);

        return root;  
    }

    //converting sorted ArrayList into Balanced BST
    public static Node balancedBST(ArrayList<Integer> arr, int si, int ei){
        if(si>ei){
            return null;
        }
        int mid = si +(ei-si)/2;
        Node root = new Node(arr.get(mid));
        root.left = balancedBST(arr, si, mid-1);
        root.right = balancedBST(arr, mid+1, ei);

        return root;
    } 

    //this is bascically just to print
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //converting initial BST into an inorder lis
    public static void inorder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    public static void main(String args[]){

        // create BST ka main wala code galti se uda diya
        //given sorted arary convert to BST

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left= new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = mainBalancedBST(root);
        preorder(root);

    }
}