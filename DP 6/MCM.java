import java.util.*;
public class MCM {

    public static int mcm(int arr[], int i, int j){
        if(i==j){
            return 0;   //single matrix case
        }
        int ans = Integer.MAX_VALUE;

        for(int k=i;k<=j-1;k++){
            int cost1 = mcm(arr,i,k);       //set1 Ai to Ak
            int cost2 = mcm(arr,k+1,j);     //set 2 Ak+1 to Aj 
            int cost3 = arr[i-1]*arr[k]*arr[j];  //a*b*d
            int finalcost = cost1+cost2+cost3;
            ans = Math.min(ans,finalcost);
        }
        return ans;             //min cost
    }

        public static int mcmMem(int arr[], int i, int j, int dp[][]){
        if(i==j){
            return 0;   //single matrix case
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;

        for(int k=i;k<=j-1;k++){
            int cost1 = mcm(arr,i,k);       //set1 Ai to Ak
            int cost2 = mcm(arr,k+1,j);     //set 2 Ak+1 to Aj 
            int cost3 = arr[i-1]*arr[k]*arr[j];  //a*b*d
            int finalcost = cost1+cost2+cost3;
            ans = Math.min(ans,finalcost);
        }
        dp[i][j] = ans;
        return dp[i][j];             //min cost
    }

    public static int mcmTab(int arr[]){
        int n = arr.length;
        int dp[][] = new int[n][n];
        
        //initialization
        for(int i=0;i<n;i++){
            dp[i][i] = 0;
        }

        //bottom-up
        for(int len=2; len<=n-1; len++){
            for(int i=1; i<=n-len; i++){
                int j = i+len-1; //col
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1]*arr[k]*arr[j];
                    dp[i][j] = Math.min(dp[i][j],cost1+cost2+cost3);
                }
            }
        }
        print(dp);
        return dp[1][n-1];
    }

    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;
        // System.out.println(mcm(arr, 1, n-1));

        //mem
        // int dp[][] = new int[n][n];

        // for(int i=0;i<n;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        // System.out.println(mcmMem(arr, 1, n-1, dp));

        //TAB
        System.out.println(mcmTab(arr));
    }
}
