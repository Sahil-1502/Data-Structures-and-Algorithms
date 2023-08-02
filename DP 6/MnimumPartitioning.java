public class MnimumPartitioning {

    public static int minimumPartition(int nums[]){
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        
        int sum1 = knapsack(nums, sum/2);
        int sum2 = sum - sum1;
        return Math.abs(sum1-sum2);
    }

    public static int knapsack(int nums[],int W){
        int n = nums.length;
        int dp[][] = new int[n+1][W+1];

        for(int i=0;i<dp.length;i++){
            dp[i][0] =0; 
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j] = 0;
        }

        //bottom up
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(nums[i-1]<=j){
                    dp[i][j] = Math.max(nums[i-1]+dp[i-1][j-nums[i-1]],dp[i-1][j]);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String args[]){
        int nums[] = {1,6,11,5};
        System.out.println(minimumPartition(nums));
    }
}
