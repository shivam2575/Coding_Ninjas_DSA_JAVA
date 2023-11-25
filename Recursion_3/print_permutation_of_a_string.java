package Recursion_3;

public class print_permutation_of_a_string {
    public static void permutations(String input){
		// Write your code here
		per_helper(input,"");

	}

	public static void per_helper(String input, String ans ){
		if(input.length()==0){
			System.out.println(ans);
			return;
		}
		for(int i=0; i<input.length(); i++){
			char fixed = input.charAt(i);
			String new_input = input.substring(0, i)+input.substring(i+1, input.length());
			String new_ans = ans+fixed;
			per_helper(new_input, new_ans);
		}
	}
}
