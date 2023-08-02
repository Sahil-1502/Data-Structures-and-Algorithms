// import java.util.*;
public class StringCompression {
    public static void main(String args[]){
        String str = "aaabbcccdd";
        // String str = "abcd";
        StringCompressionUtil(str);
    }

    // public static void StringCompressionUtil(String str){
    //     StringBuilder sb = new StringBuilder("");
    //     for(int i=0;i<str.length();i++){
    //         Integer count=1;
    //         while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
    //             count++;
    //             i++;
    //         }
    //         sb.append(str.charAt(i));
    //         if(count>1){
    //             count.toString();
    //             sb.append(count);
    //         } 
    //     }
    //     System.out.println(sb);
    // }

    public static void StringCompressionUtil(String str){
        StringBuilder sb = new StringBuilder("");

        int count = 1;
        int n = str.length();
        for(int i=0;i<str.length();i++){
            if(i<n-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
            } else {
                sb.append(str.charAt(i));
                sb.append(count);
                count =1;
            }
        }

        System.out.println(sb);
    }
}
