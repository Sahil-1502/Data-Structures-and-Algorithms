public class StartsWith {
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

    public static boolean startsWith(String word){

        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';

            if(curr.children[idx] == null){
                return false;
            } else {
                curr = curr.children[idx];
            }
        }

        return true;
    }

    public static void main(String arsg[]){
        String words[] = {"apple", "app", "mango", "man", "women"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startsWith("app"));
        System.out.println(startsWith("hi"));
    }
}
