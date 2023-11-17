package Strings;

public class remove_character {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		StringBuffer sb = new StringBuffer(str);

		for(int i=0; i<sb.length(); ){
			if(sb.charAt(i)==ch){
				sb.deleteCharAt(i);
			}else{
				i++;
			}

		}

		return sb.toString();
	}
}
