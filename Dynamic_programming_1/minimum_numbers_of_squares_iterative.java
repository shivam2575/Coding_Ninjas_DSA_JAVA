package Dynamic_programming_1;

public class minimum_numbers_of_squares_iterative {
    public static int minCount(int n) {
		//Your code goes here
		if(n==0){
			return 0;
		}
		int dp[] = new int[n+1];
		dp[0]=0;

		for(int i=1; i<=n; i++){
			int min = Integer.MAX_VALUE;
			for(int j=1; j*j<=i; j++){
				int curr = dp[i-(j*j)];
				if(min>curr){
					min = curr;
				}
			}
			dp[i] = 1+min;
		}
		return dp[n];
	}
}
