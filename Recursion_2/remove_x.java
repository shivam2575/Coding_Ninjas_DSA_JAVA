package Recursion_2;

public class remove_x {
    public static String removeX(String input){
		// Write your code here
		if(input.length()==0){
			return input;
		}

		String smallAns = removeX(input.substring(1));
		if(input.charAt(0)=='x'){
			return smallAns;
		}
		return input.charAt(0)+smallAns;
	}
}
