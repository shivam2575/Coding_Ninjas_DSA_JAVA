package Dynamic_programming_1;

public class stair_case_memoization {
    public static long staircase(int n) {
		//Your code goes here
		long[] dp = new long[n+1];
		for(int i=0; i<=n; i++){
			dp[i] = -1;
		}
		return help(n, dp);
	}

	public static long help(int n, long[] dp){
		if(n<=0){
			return 1;
		}
		if(n==1||n==2){
			return n;
		}
		long step1, step2,step3;
		if(dp[n-1]==-1){
			step1 = help(n-1, dp);
			dp[n-1]=step1;
		}else{
			step1 = dp[n-1];
		}

		if(dp[n-2]==-1){
			step2 = help(n-2, dp);
			dp[n-2]=step2;
		}else{
			step2 = dp[n-2];
		}

		if(dp[n-3]==-1){
			step3 = help(n-3, dp);
			dp[n-3]=step3;
		}else{
			step3 = dp[n-3];
		}

		long my_ans = step1+step2+step3;
		return my_ans;
	}
}
