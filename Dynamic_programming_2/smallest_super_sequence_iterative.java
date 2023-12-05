package Dynamic_programming_2;

public class smallest_super_sequence_iterative {
    public static int smallestSuperSequence(String str1, String str2) {

        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		int n = str1.length();
		int m = str2.length();
		int[][] dp = new int[n+1][m+1];

		for(int i=0; i<=m; i++){
			dp[n][i] = m-i;
		}

		for(int i=0; i<=n; i++){
			dp[i][m] = n-i;
		}

		for(int i=n-1; i>=0; i--){
			for(int j=m-1; j>=0; j--){
				if(str1.charAt(i)==str2.charAt(j)){
					dp[i][j] = 1+dp[i+1][j+1];
				}else{
					dp[i][j] = 1+Math.min(dp[i+1][j], dp[i][j+1]);
				}
			}
		}

		return dp[0][0];
     
}
}
