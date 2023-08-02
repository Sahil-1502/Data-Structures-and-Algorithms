// import java.util.*;
public class StringPlaindrome {
    public static void main(String args[]){
        String str = "racecarp";
        StringPalindrome(str);
    }

    public static boolean StringPalindrome(String str){
        int i =0;
        int n=str.length();
        while(i<n/2){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("not a palindrome");
                return false;
            }
            i++;
        }
        System.out.println("it is a palindrome");
        return true;

    }
}
