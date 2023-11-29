package Dynamic_programming_1;

public class minimum_numbers_of_squares {
    public static int minCount(int n) {
		//Your code goes here
		int dp[] = new int[n+1];
		for(int i=0; i<=n; i++){
			dp[i]=-1;
		}
		return help(n,dp);
	}

	public static int help(int n, int[] dp) {
		//Your code goes here
		if(n==0){
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for(int i=1; i*i<=n; i++){
			int curr;
			if(dp[n-(i*i)]==-1){
				curr = help(n-(i*i),dp);
				dp[n-(i*i)]=curr;
			}else{
				curr = dp[n-(i*i)];
			}
			if(curr<min){
				min = curr;
			}
		}

		return min+1;
	}
}
