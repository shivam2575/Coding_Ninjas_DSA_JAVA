package Recursion_3;

public class print_subset_sum_to_k {
    public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
		print_helper(input, k, 0, "");
	}

	public static void print_helper(int[] input, int k, int si, String output){
		if(si>=input.length || k==0){
			if(k==0){
				System.out.println(output.subSequence(0, output.length()-1));
				return;
			}
			return;
		}
		print_helper(input, k, si+1, output);
		output+=input[si]+" ";
		print_helper(input, k-input[si], si+1, output);
	}
}
