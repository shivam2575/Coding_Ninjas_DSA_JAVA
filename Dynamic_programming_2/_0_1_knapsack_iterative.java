package Dynamic_programming_2;

public class _0_1_knapsack_iterative {
    public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		//Your code goes here
		int[][] dp = new int[n+1][maxWeight+1];
		for(int i=n-1; i>=0; i--){
			for(int j=0; j<=maxWeight; j++){
				int ans;
				if(weights[i]<=j){
					int ans1,ans2;
					ans1 = values[i]+dp[i+1][j-weights[i]];
					ans2 = dp[i+1][j];
					ans = Math.max(ans1, ans2);
				}else{
					ans = dp[i+1][j];
				}
				dp[i][j]=ans;
			}
		}
		return dp[0][maxWeight];
	}
}
