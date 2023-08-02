import java.util.*;
public class PrefixSum {

    public static void PrefixSum(int array[]){

        int largest = Integer.MIN_VALUE;

        //calculate prefix
        int prefix[] = new int[array.length];
        prefix[0]=array[0];
        for(int i=1;i<array.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }

        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int sum = i == 0? prefix[j] : prefix[j]-prefix[i-1];
                if(sum>largest){
                    largest = sum;
                }
            }
        }
        System.out.println(largest);

    }

    public static void main(String args[]){
        int array[] = {1,-2,6,-1,3};
        PrefixSum(array);

    }
}
