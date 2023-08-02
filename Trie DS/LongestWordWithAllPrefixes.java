// my method can't return the longest one returns all
public class LongestWordWithAllPrefixes {
    
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
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
        if(curr.eow == true){
            return true;
        }
        return false;
    }

    public static boolean searchLongest(String word){

        Node curr = root;
        
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';

            if(curr.children[idx] != null && curr.children[idx].eow == true){
                curr = curr.children[idx];
            } else {
                return false;
            }  
        }
        return true;
    }

    

    public static void main(String args[]){

        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        for(int i=0;i<words.length;i++){
            if(searchLongest(words[i])){
                System.out.println(words[i]);
            }
        }
    }
}
