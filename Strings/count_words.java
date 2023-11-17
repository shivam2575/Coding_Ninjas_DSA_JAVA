package Strings;

public class count_words {
    public static int countWords(String str) {	
		//Your code goes here
		int len = str.length();
		if(len==0){
			return 0;
		}
		int count = 1;
		for(int i=0; i<len; i++){
			if(str.charAt(i)==' '){
				count++;
			}
		}

		return count;
	}
}
