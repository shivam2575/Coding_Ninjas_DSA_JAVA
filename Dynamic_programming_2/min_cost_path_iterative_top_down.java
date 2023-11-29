package Dynamic_programming_2;

public class min_cost_path_iterative_top_down {
    public static int minCostPath(int[][] input) {
		// Your code goes here
		int row = input.length;
		int col = input[0].length;
		int[][] dp = new int[row + 1][col + 1];
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= col; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}

		for(int i=1; i<=row; i++){
			for(int j=1; j<=col; j++){
				if(i==1 && j==1){
					dp[i][j] = input[i-1][j-1];
					continue;
				}
				dp[i][j] = input[i-1][j-1]+Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]));
			}
		}
		return dp[row][col];
	}
}
