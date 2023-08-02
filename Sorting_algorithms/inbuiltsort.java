import java.util.*;
public class inbuiltsort {
    public static void main(String args[]){
        Integer array[] = {5,4,1,3,2};
        // Arrays.sort(array);
        // printarray(array);
        // Arrays.sort(array,0,3);
        // printarray(array);
        // Arrays.sort(array,Collections.reverseOrder());
        // printarray(array);
        Arrays.sort(array,Collections.reverseOrder());
        printarray(array);
        
    }
    public static void printarray(Integer array[]){    
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    
    }
}
