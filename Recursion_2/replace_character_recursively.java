package Recursion_2;

public class replace_character_recursively {
    public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		 if(input.length()==0){
			 return input;
		 }

		 String smallAns = replaceCharacter(input.substring(1), c1, c2);
		 if(input.charAt(0)==c1){
			 return c2+smallAns;
		 }
		 return input.charAt(0)+smallAns;

	}
}
