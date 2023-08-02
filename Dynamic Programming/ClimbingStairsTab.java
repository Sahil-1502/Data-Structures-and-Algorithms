public class ClimbingStairsTab {

    public static int WaysByTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;

        for(int i=1;i<=n;i++){
            if(i<=1){
                dp[i] = dp[i-1] + 0;
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];

        // dp[1] = 1;
        // for(int i=2;i<=n;i++){
        //     dp[i] = dp[i-1]+dp[i-2];
        // }
        // return dp[n];
    }
    public static void main(String args[]){
        System.out.println(WaysByTab(5));
    }
}
