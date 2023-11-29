package Dynamic_programming_2;

public class min_cost_path_iterative_bottom_up {
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

		for(int i=row-1; i>=0; i--){
			for(int j=col-1; j>=0; j--){
				if(i==row-1 && j==col-1){
					dp[i][j] = input[i][j];
					continue;
				}
				dp[i][j] = input[i][j]+Math.min(dp[i][j+1], Math.min(dp[i+1][j], dp[i+1][j+1]));
			}
		}
		return dp[0][0];
	}
}
