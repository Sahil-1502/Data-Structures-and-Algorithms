public class ShortestPrefix {

    public static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
            freq =1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;              //children ki freq badani hai
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    // public static void uniquePrefix(String word){            //MINE ITERATIVE

    //     String ans ="";
    //     Node curr = root;                                   //hendre node ko root loop ke bahar le
    //     for(int i=0;i<word.length();i++){

    //         int idx = word.charAt(i)-'a';
    //         ans = ans+word.charAt(i);           
    //         if(curr.children[idx]==null){                    // waise toh null ho hi nahi safta toh outer if nikal de

    //         }else {
    //             if(curr.children[idx].freq == 1){
    //                 break;
    //             } else {

    //             }
    //         }
    //         curr = curr.children[idx];
    //     }
    //     System.out.println(ans);
    // }

    public static void findPrefix(Node root, String ans){ //O(L) - longest word

        if(root == null){
            return;
        }
        if(root.freq ==1){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<root.children.length;i++){

            if(root.children[i] != null){
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }



    public static void prefix(String words[]){

        //insert all words in trie
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        root.freq =-1;          //varna sirf first letter milega

        // for(int i=0;i<words.length;i++){
        //     uniquePrefix(words[i]);          //for mine iterative
        // }

        findPrefix(root, "");               //mam recursive
    }

    public static void main(String args[]){
        String words[] = {"zebra", "dog", "duck", "dove"};

        prefix(words);
    }
}
