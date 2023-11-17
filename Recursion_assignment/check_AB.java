package Recursion_assignment;

public class check_AB {
    public static boolean checkAB(String input) {
		// Write your code here
		if(input.length()==0){
			return true;
		}
		if(input.length()==1){
			if(input.equals("a")){
				return true;
			}
			return false;
		}

		if(input.charAt(0)=='a'){
			if(input.charAt(1)=='a'){
				return checkAB(input.substring(1));
			}
			else if(input.length()>=3 && input.charAt(1)=='b' && input.charAt(2)=='b'){
				return checkAB(input.substring(3));
			}else{
				return false;
			}
		}
		return false;
	}
}
