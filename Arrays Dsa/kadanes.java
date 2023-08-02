import java.util.*;
public class kadanes {

    public static int maxSubArray(int[] nums) {
        int cs = nums[0];           //curr sum
        int ms = nums[0];         //max sum

        cs = 0; ms  = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cs = cs + nums[i];
            ms = Math.max(ms,cs);
            if(cs<0){
                cs = 0;
            }   
        }
        return ms;
    }


    public static void main(String[] args) {
        int numbers[]={-2,-3,-4,-1,-2,-1,-5,-3};
        System.out.println("Max Subarray Sum is " + maxSubArray(numbers));
    }
}
