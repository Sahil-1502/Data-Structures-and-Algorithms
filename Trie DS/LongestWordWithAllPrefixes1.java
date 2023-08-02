//mam ki method
// import java.util.*;
public class LongestWordWithAllPrefixes1 {
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

    static String ans = "";
    public static void longestWord(Node root,StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i] != null && root.children[i].eow == true){
                // char ch = (char) i + 'a';
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String args[]){
        // String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        String words[] = {"a", "banana", "app", "appl", "ap", "apply"};

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);

    }
}
