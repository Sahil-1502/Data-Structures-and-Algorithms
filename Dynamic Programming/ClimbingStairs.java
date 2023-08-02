import java.util.*;
public class ClimbingStairs {

    public static int ClimbingStairs(int n, int dp[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        // if(n==0 || n==1){     // 1 ke liye 0 call hoga aur -1 call hoga
        //     return 1;
        // }
        // if(n == 2){          //two ke liye 0 call hoga aur 1 call hoga =2
        //     return 2;
        // }
        if(dp[n] != -1){                //maine dp[n] != 0 liya tha
        return dp[n];
        }
        dp[n] = ClimbingStairs(n-1, dp)+ClimbingStairs(n-2, dp);
        return dp[n];
    }
    public static void main(String args[]){
        int n =5;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(ClimbingStairs(n,dp ));;
    }
}
