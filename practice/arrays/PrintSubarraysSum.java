import java.util.*;;

public class PrintSubarraysSum {
    
    public static void Subarrays(int array[]){
        
        int largest = Integer.MIN_VALUE ;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int sum=0;
                for(int k = i;k<=j;k++){
                    sum = sum +array[k];
                }
                if(sum>largest){
                    largest=sum;
                }
            }
        }
        System.out.println(largest);
    }
    
    public static void main(String args[]){
        int array[] = {1,-2,6,-1,3};
        Subarrays(array);
    }
}
