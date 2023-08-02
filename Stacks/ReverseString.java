import java.util.Stack;
public class ReverseString {
    public static void main(String args[]){
        
        String str = "abc";
        System.out.println(Reverse(str));
    }

    public static StringBuilder Reverse(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        StringBuilder ans = new StringBuilder("");
        
        while(!s.isEmpty()){
            ans.append(s.pop());
            
        }
        return ans;
    }

}
