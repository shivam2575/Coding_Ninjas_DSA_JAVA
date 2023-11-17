package Recursion_3;

public class return_keypad {
    public static String[] keypad(int n){
		// Write your code here
		String keypads[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		return keypad_helper(n,keypads);

	}

	public static String[] keypad_helper(int n, String[] keys){
		// Write your code here
		if(n==0){
			String[] ans = {""};
			return ans;
		}

		String[] small_ans = keypad_helper(n/10, keys);
		int rem = n%10;
		String ans[] = new String[small_ans.length*keys[rem].length()];
		for(int i=0,k=0; i<keys[rem].length(); i++){
			for(int j=0; j<small_ans.length; j++){
				ans[k++] = small_ans[j]+keys[rem].charAt(i);
			}
		}

		return ans;

	}
}
