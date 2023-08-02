public class Build {
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

    public static boolean search(Node root, int key){   //O(H)
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
           return search(root.left, key);
        }else {
           return search(root.right, key);
        } 
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node delete(Node root, int delete){
        if(delete < root.data){
            root.left = delete(root.left, delete);
        } else if(delete > root.data){
            root.right = delete(root.right, delete);
        }
        else{ //viola root.data == delete
            //case -1 no child
            if(root.right == null && root.left == null){
                return null;
            }
            // case -2 1 child
            if(root.right ==null){
                return root.left;
            }else if(root.left == null){
                return root.right;
            }
            //case -3 2 child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }

        return root ;
    }

    // public static void printRange(Node root, int si,int ei){
    //     if(root == null){
    //         return ;
    //     }

    //     printRange(root.left, si, ei);
    //     if(si<=root.data && root.data<=ei){
    //         System.out.print(root.data+ " ");
    //     }
    //     printRange(root.right, si, ei);
    // }

    //optimized
    public static void printRange(Node root,int si, int ei){
        if(root == null){
            return;
        }
        if(si<= root.data && root.data<=ei){
            printRange(root.left, si, ei);
            System.out.print(root.data + " ");
            printRange(root.right, si, ei); 
        } else if(root.data>si){
            printRange(root.left, si, ei);
        } else {
            printRange(root.right, si, ei);
        }
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String args[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i= 0; i<values.length;i++){
            root = insert(root, values[i]);
        }
        // inorder(root);
        // // System.out.println(search(root, 8));

        // root = delete(root, 3);
        // System.out.println();

        // inorder(root);
        printRange(root, 10, 14);
    }
}