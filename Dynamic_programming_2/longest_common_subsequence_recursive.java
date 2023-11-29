package Dynamic_programming_2;

public class longest_common_subsequence_recursive {
    public static int lcs(String s, String t) {
		// Your code goes here
		return help(s, t, 0, 0);
	}

	public static int help(String s, String t, int si, int ti) {
		// Your code goes here
		if (si == s.length() || ti == t.length()) {
			return 0;
		}
		int ans;
		if (s.charAt(si) == t.charAt(ti)) {
			ans = help(s, t, si+1, ti+1) + 1;
		} else {
			int ans1 = help(s, t, si+1, ti);
			int ans2 = help(s, t, si, ti+1);
			ans = Math.max(ans1, ans2);
		}

		return ans;
	}

    public static void main(String[] args) {
        System.out.println(lcs("abc", "bcd"));
    }
}
