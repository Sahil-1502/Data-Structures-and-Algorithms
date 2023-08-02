import java.util.*;
public class MergeBST {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void inorder(Node root,ArrayList<Integer> seq){
        if(root ==null){
            return;
        }
        inorder(root.left, seq);
        seq.add(root.data);
        inorder(root.right,seq);
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> seq1,ArrayList<Integer> seq2){
        ArrayList<Integer> finalseq = new ArrayList<>();
        int a1 = 0;
        int a2 =0;
        // int finalp =0;

        while(a1<seq1.size() && a2<seq2.size()){
            if(seq1.get(a1)<=seq2.get(a2)){
                finalseq.add(seq1.get(a1));
                a1++;
                // finalp++;
            } else {
                finalseq.add(seq2.get(a2));
                a2++;
                // finalp++;
            }
        }
        while(a1<seq1.size()){
            finalseq.add(seq1.get(a1));
            a1++;
            // finalp++;
        }
        while(a2<seq2.size()){
            finalseq.add(seq2.get(a2));
            a2++;
            // finalp++;
        }
        return finalseq;
    }

    public static Node createBST(ArrayList<Integer> finalseq, int si,int ei){
        if(si>ei){
            return null;
        }
        int mid = si + (ei-si)/2;
        Node root = new Node(finalseq.get(mid));    //galti se index pass kar diya 
        root.left = createBST(finalseq, si, mid-1);
        root.right = createBST(finalseq, mid+1, ei);

        return root;
    }

    public static Node mergeBST(Node root1, Node root2){
        ArrayList<Integer> seq1 = new ArrayList<>();
        ArrayList<Integer> seq2 = new ArrayList<>();

        inorder(root1, seq1);
        inorder(root2, seq2);

        ArrayList<Integer> finalseq = merge(seq1,seq2);

        Node root= createBST(finalseq,0,finalseq.size()-1);

        return root;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]){

        Node root1 = new Node(2);
        root1.right = new Node(4);
        root1.left = new Node(1);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        preorder(root);
    }
}
