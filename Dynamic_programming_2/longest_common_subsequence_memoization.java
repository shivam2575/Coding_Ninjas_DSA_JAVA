package Dynamic_programming_2;

public class longest_common_subsequence_memoization {
    public static int lcs(String s, String t) {
		// Your code goes here
		int row = s.length();
		int col = t.length();
		int[][] dp = new int[row+1][col+1];
		for(int i=0; i<=row; i++){
			for(int j=0; j<=col; j++){
				dp[i][j] = -1;
			}
		}
		return help(s, t, 0, 0, dp);
	}

	public static int help(String s, String t, int si, int ti, int[][] dp) {
		// Your code goes here
		if (si >= s.length() || ti >= t.length()) {
			return 0;
		}
		int ans;
		if (s.charAt(si) == t.charAt(ti)) {
			int small_ans;
			if(dp[si+1][ti+1]==-1){
				small_ans = help(s, t, si+1, ti+1, dp);
				dp[si+1][ti+1] = small_ans;
			}else{
				small_ans = dp[si+1][ti+1];
			}
			ans = 1+small_ans;
		} else {
			int ans1,ans2;
			if(dp[si+1][ti]==-1){
				ans1 = help(s, t, si+1, ti, dp);
				dp[si+1][ti] = ans1;
			}else{
				ans1 = dp[si+1][ti];
			}

			if(dp[si][ti+1]==-1){
				ans2 = help(s, t, si, ti+1, dp);
				dp[si][ti+1] = ans2;
			}else{
				ans2 = dp[si][ti+1];
			}
			
			ans = Math.max(ans1, ans2);
		}

		return ans;
	}
}
