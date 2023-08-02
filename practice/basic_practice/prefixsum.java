import java.util.*;

public class prefixsum {
    public static void main(String args[]){
        int array[] = {1,-2,6,-1,3};
        System.out.println(prefixsum(array));
    }

    public static int prefixsum(int array[]){
        int prefix[] = new int[array.length];
        int sum;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            prefix[i]= i==0? array[i] : prefix[i-1]+array[i];
        }
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                sum = i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(sum>largest){
                    largest=sum;
                }
            }
        }
        return largest;
    }
}
