public class Permutations {
    public static void main(String args[]){
        String str = "abc";
        permutations(str, "");
    }

    public static void permutations(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int j=0;j<str.length();j++){ 
            char curr = str.charAt(j);
            //"abcde" --> "ab" + "de" = "abde"


            // removed the charecter from the string
            // in substring the last char is not included 
            String Newstr = str.substring(0, j) + str.substring(j+1);
            // we made a new string above it was affecting the loop

            // IMP we can't write the statement written below as we have 
            // deleted that char from string already
            // permutations(str, ans+ str.charAt(j), i+1);
            permutations(Newstr, ans+curr);
        }

    }
}
