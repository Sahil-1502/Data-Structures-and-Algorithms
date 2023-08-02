import java.util.*;
public class Strings {

    public static void main(String args[]){
    // String str = new String("abcd");
    // String str2 = "abcd";
    // char array[] = {'a','b','c','d'};

    // Scanner sc = new Scanner(System.in);
    // String str3;
    // str3 = sc.nextLine();
    // System.out.println(str3);
    // System.out.println(str3.length()); 
    String str4 = "sahil";
    String str5 = "Shaikh";
    String fullname = str4 + " " + str5;
    System.out.println(fullname.charAt(10));
    prinntLetters(str5);
    }

    public static void prinntLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " " );
        }
    }
}
