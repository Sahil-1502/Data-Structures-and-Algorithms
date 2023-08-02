import java.util.*;
// import java.util.HashMap;

public class LargestSubarraySum0 {

    public static void main(String args[]){
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        HashMap<Integer,Integer> hm = new HashMap<>();

        int length = 0;
        int sum = arr[0];
        
        for(int j=0;j<arr.length;j++){
            if(hm.containsKey(sum)){
                length = Math.max((j-hm.get(sum))  , length);
            } else {
                hm.put(sum,j);
            }
            sum += arr[j];
        }
        System.out.println(length);
    }
}
