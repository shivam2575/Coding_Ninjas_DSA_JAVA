package Hashmaps;

import java.util.HashMap;

public class excat_unique_character {
    public static String uniqueChar(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++){
			map.put(str.charAt(i), 1);
		}
		String ans="";
		for(int i=0; i<str.length(); i++){
			if(map.get(str.charAt(i))>0){
				ans+=str.charAt(i);
				map.put(str.charAt(i), 0);
			}
		}

		return ans;

	}
}
