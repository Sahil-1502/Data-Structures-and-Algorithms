import java.util.*;
public class DuplicateParenthesis{    //O(n)
    public static void main(String args[]){
        String str = "(((a+b)+(c+d)))";  // true
        String str1 = "((a+b)+(c+d))";   // false
        System.out.println(duplicate(str));
        System.out.println(duplicate(str1));

    }
    public static boolean duplicate(String str){

        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch != ')'){
                s.push(ch);
            } else {
                int count = 0;
                while(s.pop() != '('){
                    count++;
                }
                if(count == 0){
                    return true;
                }
            }
        }
        return false;
    }
}

//INSIDE ELSE       
// int count = 0;
// while(s.peek() != '('){
//     s.pop();
//     count++;
// }
// if(count == 0){
//     return true;
// }
// s.pop();   