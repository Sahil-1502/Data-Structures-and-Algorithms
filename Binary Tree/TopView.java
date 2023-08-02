import java.util.*;
import java.util.LinkedList;
import java.util.HashMap;
public class TopView {

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
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        if(root == null){
            return;
        }

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min =0,max =0;
        q.add(new Info(root,0));

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(!map.containsKey(curr.hd)){  //first time this hd has occured
                map.put(curr.hd,curr.node);
                // min = Math.min(min,curr.hd);
                // max = Math.max(max,curr.hd);
            }
            if(curr.node.left != null){
                q.add(new Info (curr.node.left, curr.hd-1));
                min = Math.min(curr.hd-1,min);
            }
            if(curr.node.right != null){
                q.add(new Info(curr.node.right, curr.hd+1));
                max = Math.max(curr.hd+1,max);
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }


    public static void main(String args[]){

        // root tree 
        //     1
        //    / \ 
        //   2   3
        //    \  
        //     4
        //      \
        //       5
        //        \
        //         6
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        topView(root);
    }
}