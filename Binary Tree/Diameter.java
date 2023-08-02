public class Diameter {
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

    public static class Info{
        int dia;
        int ht;

        public Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static int height(Node root){
        if (root ==null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        int height = Math.max(lh,rh)+1;

        return height;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int self = height(root.left)+height(root.right)+1;

        return Math.max(self,Math.max(ld,rd));
        // int max = Math.max(ld,rd);
        // max = Math.max(max,self);
        // return max;

    }

    public static Info optimizedDiameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info left = optimizedDiameter(root.left);
        Info right = optimizedDiameter(root.right);

        int dia = Math.max(left.ht+right.ht+1,Math.max(left.dia, right.dia));
        int ht = Math.max(left.ht,right.ht)+1;
        return new Info(dia,ht);

    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Info finali = optimizedDiameter(root);
        // System.out.println(finali.dia);
        System.out.println(optimizedDiameter(root).dia);
        
    }

}
