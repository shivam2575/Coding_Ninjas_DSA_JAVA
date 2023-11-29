package Dynamic_programming_1;

public class min_steps_to_one {
    public static int countMinStepsToOne(int n) {
		// Your code goes here
		if (n == 1) {
			return 0;
		}
		int[] dp = new int[n + 1];
		dp[1]=0;
		for (int i = 2; i <= n; i++) {
			int ans1 = Integer.MAX_VALUE;
			int ans2 = Integer.MAX_VALUE;
			int ans3 = Integer.MAX_VALUE;

			ans1 = dp[i-1];

			if(i%3==0){
				ans3=dp[i/3];
			}
			
			if(i%2==0){
				ans2 = dp[i/2];
			}

			dp[i] = 1+Math.min(ans1,Math.min(ans2, ans3));
		}

		return dp[n];
	}

	//Through Memoization
	public static int help(int n, int[] dp) {
		if (n == 1) {
			return 0;
		}

		int ans1;
		if (dp[n - 1] == -1) {
			ans1 = help(n - 1, dp);
			dp[n - 1] = ans1;
		} else {
			ans1 = dp[n - 1];
		}

		int ans2 = Integer.MAX_VALUE;
		if (n % 2 == 0) {
			if (dp[n / 2] == -1) {
				ans2 = help(n / 2, dp);
				dp[n / 2] = ans2;
			} else {
				ans2 = dp[n / 2];
			}
		}

		int ans3 = Integer.MAX_VALUE;
		if (n % 3 == 0) {
			if (dp[n / 3] == -1) {
				ans3 = help(n / 3, dp);
				dp[n / 3] = ans3;
			} else {
				ans3 = dp[n / 3];
			}
		}

		return Math.min(ans1, Math.min(ans2, ans3)) + 1;
	}
}
