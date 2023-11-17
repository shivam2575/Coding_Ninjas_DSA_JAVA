package Strings;

public class reverse_string_wordwise {
    public static String reverseWordWise(String str) {
		// Write your code here
		int len = str.length(),start=0;
		String ans = "";

		for(int end = 0; end<len; end++){
			if(str.charAt(end)==' '){
				ans = " "+str.substring(start,end)+ans;
				start = end+1;
			}
		}

		return str.substring(start,len)+ans;

	}
}
