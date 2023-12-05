package Dynamic_programming_2;

public class longest_common_subsequence_iterative_top_down {
    public static int lcs(String s, String t) {
		// Your code goes here
		int row = s.length();
		int col = t.length();
		int[][] dp = new int[row+1][col+1];
		for(int i=0; i<=row; i++){
			for(int j=0; j<=col; j++){
				dp[i][j] = 0;
			}
		}
		for(int i=1; i<=row; i++){
			for(int j=1; j<=col; j++){
				if(s.charAt(i-1)==t.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1]+1;
				}else{
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		return dp[row][col];
	}
}
