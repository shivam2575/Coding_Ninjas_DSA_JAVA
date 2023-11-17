package Strings;

public class reverse_each_word {
    public static String reverse(String str){
		int n = str.length();
		String s = "";
		for(int i=0; i<n; i++){
			s = str.charAt(i)+s;
		}

		return s;
			
	}

	public static String reverseEachWord(String str) {
		//Your code goes here
		int n = str.length(), start=0;
		String ans = "";

		for(int end = 0; end<n; end++){
			if(str.charAt(end)==' '){
				ans+= reverse(str.substring(start,end))+" ";
				start=end+1;
			}
		}

		return ans+reverse(str.substring(start,n))+" ";
		
	}
}
