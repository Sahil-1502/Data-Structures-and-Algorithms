public class UniqueSubstring1 {
    

    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow=true;
    }

    public static boolean search(String word){

        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';

            if(curr.children[idx] == null){
                return false;
            } else {
                curr = curr.children[idx];
            }
        }

        return curr.eow == true;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count =0;
        for(int i=0;i<26;i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String args[]){
        // String word ="ababa";
        String word ="apple";

        for(int i=0;i<word.length();i++){
            String sub = word.substring(i);
            insert(sub);
        }
        System.out.println(countNodes(root));

    }
}