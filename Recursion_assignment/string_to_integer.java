package Recursion_assignment;

public class string_to_integer {
    public static int convertStringToInt(String input){
		// Write your code here
		if(input.length()==1){
			return Integer.parseInt(input);
		}
		int smallAns = convertStringToInt(input.substring(1));
		return ((input.charAt(0)-'0')*(int)Math.pow(10, input.length()-1))+smallAns;

	}
}
