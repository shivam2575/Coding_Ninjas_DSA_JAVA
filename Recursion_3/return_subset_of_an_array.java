package Recursion_3;

public class return_subset_of_an_array {
    // Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here
		return ss_helper(input,0);
	}
	public static int[][] ss_helper(int[] input, int si){
		if(si>=input.length){
			return new int[1][0];
		}
		int[][] small_arr = ss_helper(input, si+1);

		int[][] output = new int[small_arr.length*2][];

		for(int i=0; i<small_arr.length; i++){
			int[] to_add = new int[small_arr[i].length+1];
			to_add[0] = input[si];
			for(int j=1; j<to_add.length; j++){
				to_add[j] = small_arr[i][j-1]; 
			}
			output[i]=to_add;
		}

		for(int i=0; i<small_arr.length; i++){
			output[small_arr.length+i] = small_arr[i];
		}

		return output;


	}
}
