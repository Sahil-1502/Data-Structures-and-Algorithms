
public class SameSubroot {

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

    //where does the subroot lie in the tree
    public static boolean isSubtree(Node root, Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
           if(isIdentical(root, subroot)){
                return true;
           }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static boolean isIdentical(Node root, Node subroot){
        if(root == null && subroot == null){
            return true;
        } else if(root == null || subroot == null || root.data != subroot.data) {
            return false;
        }

        if(!isIdentical(root.left, subroot.left)){
            return false;
        }
        if(!isIdentical(root.right, subroot.right)){
            return false;
        }
        return true;

    }

    // if(root.data != subroot.data){
    //     return false;
    // }
    
    // return isIdentical(root.left, subroot.left) && isIdentical(root.left, subroot.left) ;
    
    public static void main(String args[]){

        // root tree 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //subroot tree 
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }
}
