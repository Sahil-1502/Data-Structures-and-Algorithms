import java.util.*;
public class ValidParenthesis {
    public static void main(String args[]){
        String str = "))";
        System.out.println(parenthesis(str));
    }
    public static boolean parenthesis(String str){

        Stack<Character> s =new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch =='[' ){
                s.push(str.charAt(i));
            } else {              
                // closing
                if(s.isEmpty()){  // agar directly closing aa gaya "))"
                    return false;
                }
                if( (s.peek() == '(' && ch == ')')
                  ||(s.peek() == '(' && ch == ')')
                  ||(s.peek() == '(' && ch == ')')){
                    s.pop();
                }else {
                    return false;
                }
            }
        }
        if(!s.isEmpty()){
            return false;
        }
        return true;
    }

}
