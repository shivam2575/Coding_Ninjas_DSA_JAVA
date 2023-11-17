package Recursion_2;

public class remove_duplicates {
    public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length()<=1){
			return s;
		}

		String smallAns = removeConsecutiveDuplicates(s.substring(1));

		if(s.charAt(0)==s.charAt(1)){
			return smallAns;
		}
		return s.charAt(0)+smallAns;

	}
}
