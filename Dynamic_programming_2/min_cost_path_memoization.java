package Dynamic_programming_2;

public class min_cost_path_memoization {
    public static int minCostPath(int[][] input) {
		// Your code goes here
		int row = input.length;
		int col = input[0].length;
		int[][] dp = new int[row + 1][col + 1];
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= col; j++) {
				dp[i][j] = Integer.MIN_VALUE;
			}
		}
		return help(input, 0, 0, row, col, dp);
	}

	public static int help(int[][] input, int i, int j, int row, int col, int[][] dp) {
		// Your code goes here
		if (j >= col || i >= row) {
			return Integer.MAX_VALUE;
		}
		if (i == row - 1 && j == col - 1) {
			return input[i][j];
		}

		int right, down, diagonal;

		if (dp[i][j + 1] == Integer.MIN_VALUE) {
			right = help(input, i, j + 1, row, col, dp);
			dp[i][j + 1] = right;
		} else {
			right = dp[i][j + 1];
		}

		if (dp[i + 1][j] == Integer.MIN_VALUE) {
			down = help(input, i + 1, j, row, col, dp);
			dp[i + 1][j] = down;
		} else {
			down = dp[i + 1][j];
		}

		if (dp[i + 1][j + 1] == Integer.MIN_VALUE) {
			diagonal = help(input, i + 1, j + 1, row, col, dp);
			dp[i + 1][j + 1] = diagonal;
		} else {
			diagonal = dp[i + 1][j + 1];
		}

		return input[i][j] + Math.min(right, Math.min(down, diagonal));
	}
}
