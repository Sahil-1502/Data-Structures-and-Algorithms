import java.util.*;
// import java.util.ArrayList;
public class LCA {

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

    public static boolean getPath(Node root, int n,ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean left = getPath(root.left, n, path);
        boolean right = getPath(root.right, n, path);

        if(left || right){
            return true;
        } else {
            path.remove(path.size()-1);     //list.remove(root); 
            return false;
        }
    }

    public static Node lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        //last equal node -> i-1th
        Node lca = path1.get(i-1);
        return lca;
    }

    public static Node lca2(Node root, int n1, int n2){
        // if(root == null){
        //     return null;
        // }
        // if(root.data == n1 || root.data == n2){
        //     return root;
        // }

        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = lca2(root.left,n1 ,n2);
        Node rightLca = lca2(root.right,n1,n2);

        if(rightLca==null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }

        //i.e. when both Llca and Rlca is not null
        return root;
    }

    public static int minDisatance(Node root, int n1, int n2){
        //find lca
        Node lca = lca2(root,n1,n2);

        //distance form lca to n1
        int Dist1 = distance(lca, n1);
        int Dist2 = distance(lca, n2);

        return Dist1+Dist2;
    }

    public static int distance(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int left = distance(root.left, n);
        int right = distance(root.right, n);

        if(left>-1){
            return left+1;
        }
        if(right>-1){
            return right +1;
        }
        return -1;
        // if(left==-1 && right ==-1){
        //     return -1;
        // }
        // if(left == -1){
        //     return right+1;
        // }
        // if(right ==-1){
        //     return left+1;
        // }

    }
    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6); 
        root.right.right = new Node(7);

        // int n1=4,n2=5;
        int n1=4,n2=5;
        // System.out.println(lca(root,n1,n2).data);
        System.out.println(minDisatance(root,n1,n2));

    }
}
