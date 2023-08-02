// this is my idea check Unique SubString 1 for mam idea
public class UninqueSubstring {

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

    public static int count =0;

    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
                count++;
            }
            curr = curr.children[idx];
        }
        curr.eow=true;
    }


    public static void main(String args[]){
        // String str = "ababa";
        String str = "apple";
        
        for(int i=0;i<str.length();i++){
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(count+1);
       
        
    }
}
