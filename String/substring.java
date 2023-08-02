import java.util.*;
public class substring {
    public static void main(String args[]){
        String str = "HelloWorld";
        // Scanner sc = new Scanner(System.in);
        // int si = sc.nextInt();
        // int ei = sc.nextInt();
        //System.out.println(SubString(str, si, ei)); 
        System.out.println(str.substring(0,5));
    }


    public static String SubString(String str , int si , int ei){
        String sub = "";
        for(int i=si;i<ei;i++){
            sub += str.charAt(i);
        }
        return sub;
    }
}
