public class WordBreak {

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

        return curr.eow == true;
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1; i<=key.length();i++){
            String part1 = key.substring(0, i);
            String part2 = key.substring(i);
            if(search(part1) && wordBreak(part2)){
                return true;
            }
        }

        return false;
    }


    public static void main(String args[]){
        String words[] ={"i", "like", "sam", "samsung", "mobile", "ice"};
        // String key = "ilikesamsung";
        String key = "ilikesung";
        for(int i =0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(wordBreak(key));

    }    
}
