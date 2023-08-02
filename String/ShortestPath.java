import java.util.*;
public class ShortestPath {
    public static void main(String args[]){
        String str = "WNEENESENNN";
        // String str = "NS";
        System.out.println(getShortestPath(str)); 
    }


    public static double getShortestPath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            } else if(str.charAt(i)=='S'){
                y--;
            } else if(str.charAt(i)=='E'){
                x++;
            } else {
                x--;
            }
        }
        double sum = Math.pow(x,2)+Math.pow(y,2);
        double path = Math.sqrt(sum);
        return path;
    }
}
