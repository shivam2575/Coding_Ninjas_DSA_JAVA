package Dynamic_programming_2;

import java.util.Arrays;

public class coin_change_memoization {
    	public static int countWaysToMakeChange(int denominations[], int value) {
		// Write your code here
		int n = denominations.length;
		int[][] dp = new int[n + 1][value + 1];
		for (int[] row : dp) {
			Arrays.fill(row, 0);
		}
		return help(denominations, value, 0, dp);
	}

	public static int help(int[] arr, int val, int si, int[][] dp) {
		if (val == 0) {
			return 1;
		}

		if (val < 0) {
			return 0;
		}

		if (si >= arr.length) {
			return 0;
		}

		int with = 0, without = 0;

		if (dp[si + 1][val] == 0) {
			without = help(arr, val, si + 1, dp);
			dp[si + 1][val] = without;
		} else {
			without = dp[si + 1][val];
		}

		if (val - arr[si] >= 0) {
			if (dp[si][val - arr[si]] == 0) {
				with = help(arr, val - arr[si], si, dp);
				dp[si][val - arr[si]] = with;
			} else {
				with = dp[si][val - arr[si]];
			}

		}

		return with + without;

	}
}
