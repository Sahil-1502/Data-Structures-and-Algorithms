import java.util.*;

public class inseraionsort {
    public static void main(String args[]){
        int array[] ={5,4,1,3,2};
        insertionsort(array);
        printarray(array);
    }    

    public static void insertionsort(int array[]){
        for(int i=1;i<array.length;i++){
            int curr = array[i];
            int prev = i-1;
            while(prev>=0 && array[prev]>curr){
                array[prev+1]=array[prev];
                prev--;
            }
            //insersion
            array[prev+1]=curr;
        }
        // printarray(array);
    }

    public static void printarray(int array[]){    
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    
    }
}
