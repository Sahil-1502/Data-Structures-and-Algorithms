import java.util.*;
public class linearSearch {

    public static int linearSearch(int numbers[] , int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int numbers[]={5,9,12,14,10,63,54,36};
        int key=20;
        
        int index = linearSearch(numbers,key);
        if(index==-1){
        System.out.println("there is no index with that key");
        }
        else
        System.out.println("NOT FOUND"+ index);
    }
    
}
