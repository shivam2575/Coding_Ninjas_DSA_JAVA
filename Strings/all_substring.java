package Strings;

public class all_substring {
    public static void printSubstrings(String str) {
		//for length-wise substring
		int len = str.length();

		for(int i=0; i<len; i++){
			for(int start=0, end=i+1; end<=len; start++,end++){
				System.out.println(str.substring(start, end));
			}
		}

        //one by one aproach
        // int len = str.length();

		// for(int i=0; i<len; i++){
		// 	for(int j=i+1; j<=len; j++){
		// 		System.out.println(str.substring(i, j));
		// 	}
		// }
	}

    

}
