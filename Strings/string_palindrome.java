package Strings;

public class string_palindrome {
    public static boolean isPalindrome(String str) {
		//Your code goes here
		int len = str.length();
		for(int i=0; i<len/2; i++){
			if(str.charAt(i)!=str.charAt(len-1-i)){
				return false;
			}
		}
		return true;
	}
}
