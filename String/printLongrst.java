// import java.util.*;
public class printLongrst {
    public static void main(String args[]){
        String fruits[] = {"apple","banana","Mango","watermelon","z"};
        System.out.println(Largest(fruits)); 
    }

    public static String Largest(String fruits[]){
        String largest = fruits[0];
        for(int i =1;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest=fruits[i];
            }
        }
        return largest;
    }
}
