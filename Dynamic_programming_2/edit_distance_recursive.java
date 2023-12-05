package Dynamic_programming_2;

public class edit_distance_recursive {
    public static int editDistance(String s, String t) {
		//Your code goes here
		return help(s,t,0,0);
    }
	public static int help(String s, String t, int si, int ti){
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
			ans = help(s, t, si+1, ti+1);
		}else{
			int replace = help(s, t, si+1, ti+1);
			int delete = help(s, t, si+1, ti);
			int insert = help(s, t, si, ti+1);
			ans = Math.min(replace, Math.min(delete, insert))+1;
		}
		return ans;
	}
}
