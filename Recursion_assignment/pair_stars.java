package Recursion_assignment;

public class pair_stars {
    public static String addStars(String s) {
		// Write your code here
		if(s.length()<=1){
			return s;
		}

		String smallAns = addStars(s.substring(1));
		if(s.charAt(0)==smallAns.charAt(0)){
			return s.charAt(0)+"*"+smallAns;
		}
		return s.charAt(0)+smallAns;

	}
}
