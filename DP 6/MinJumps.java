import java.util.*;
public class MinJumps {

    public static int minJumps(int arr[]){
        int n = arr.length;
        int dp[] = new int[n]; 
        Arrays.fill(dp,-1);
        dp[n-1] = 0;

        for(int i=n-2;i>=0;i--){
            int ans = Integer.MAX_VALUE;
            for(int j=i+1; j<=i+arr[i] && j<n; j++){
                ans = Math.min(ans,dp[j]+1);
            }

            if(ans != Integer.MAX_VALUE){
                dp[i] = ans;
            }
        }
        return dp[0];
    }
    public static void main(String args[]){
        int nums[] = {2,3,1,1,4};
        System.out.println(minJumps(nums));
    }    
}
