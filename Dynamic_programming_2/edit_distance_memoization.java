package Dynamic_programming_2;

public class edit_distance_memoization {
    public static int editDistance(String s, String t) {
		//Your code goes here
		int[][] dp = new int[s.length()+1][t.length()+1];
		for(int i=0; i<dp.length; i++){
			for(int j=0; j<dp[0].length; j++){
				dp[i][j] = -1;
			}
		}
		return help(s,t,0,0,dp);
    }
	public static int help(String s, String t, int si, int ti, int[][] dp){
		int n = s.length();
		int m = t.length();
		if(si>=n){
			return m-ti;
		}
		if(ti>=m){
			return n-si;
		}
		if(s.equals(t)){
			return 0;
		}

		int ans;
		if(s.charAt(si)==t.charAt(ti)){
			if(dp[si+1][ti+1]==-1){
				ans = help(s, t, si+1, ti+1, dp);
				dp[si+1][ti+1]=ans;
			}else{
				ans = dp[si+1][ti+1];
			}	
		}else{
			int replace,delete,insert;
			if(dp[si+1][ti+1]==-1){
				replace = help(s, t, si+1, ti+1, dp);
				dp[si+1][ti+1]=replace;
			}else{
				replace = dp[si+1][ti+1];
			}

			if(dp[si+1][ti]==-1){
				delete = help(s, t, si+1, ti,dp);
				dp[si+1][ti]=delete;
			}else{
				delete = dp[si+1][ti];
			}

			if(dp[si][ti+1]==-1){
				insert = help(s, t, si, ti+1,dp);
				dp[si][ti+1]=insert;
			}else{
				insert = dp[si][ti+1];
			}

			ans = Math.min(replace, Math.min(delete, insert))+1;
		}
		return ans;
	}
}
