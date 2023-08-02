public class RemoveDuplicates {
    public static void main(String args[]){
        String str = "appnnacollege";
        boolean map[] = new boolean[26];
        StringBuilder newstr = new StringBuilder("");
        removeDuplicates(str, 0, newstr, map);
    }
    public static void removeDuplicates(String str,int i, StringBuilder newstr, boolean map[]){

        if( i == str.length()){
            System.out.println(newstr);
            return;
        }

        //kaam
        char currChar = str.charAt(i);
        if(map[currChar-'a'] == true ){
            // removeDuplicates(str, i+1, newstr, map);
        } else {
            map[currChar-'a'] = true;
            // removeDuplicates(str, i+1, newstr.append(str.charAt(i)), map);
            newstr.append(str.charAt(i));
        }

        removeDuplicates(str, i+1, newstr, map);
            
    }
}
