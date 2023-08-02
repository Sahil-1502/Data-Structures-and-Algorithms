// import java.util.*;
public class countingSort {
    public static void main(String args[]){
        int array[] = {1,4,1,3,2,4,3,7};
        countingsort(array);
        printarray(array);
    }
    public static void countingsort(int array[]){
        //for finding largest
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            largest = Math.max(largest,array[i]);
        }

        int count[] = new int[largest+1];

        //count array
        for(int i=0;i<array.length;i++){
            count[array[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                array[j]=i;
                count[i]--;
                j++;
            }
        }
    }
    public static void printarray(int array[]){    
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}