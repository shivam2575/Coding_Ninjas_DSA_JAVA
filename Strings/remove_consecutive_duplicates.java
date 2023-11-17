package Strings;

public class remove_consecutive_duplicates {
    public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		int n = str.length();
		if(n<=1){
			return str;
		}
		StringBuffer b = new StringBuffer();

		for(int i=0; i<n-1; i++){
			if(str.charAt(i)!=str.charAt(i+1)){
				b.append(str.charAt(i));
			}
		}

		b.append(str.charAt(n-1));
		return b.toString();
	}
}
