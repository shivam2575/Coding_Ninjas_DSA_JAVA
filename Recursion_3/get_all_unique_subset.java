package Recursion_3;

import java.util.Arrays;
import java.util.HashSet;

public class get_all_unique_subset {
    public static void printSubsets(int input[]) {
		// Write your code here
		int[][] ans = get_all_subset(input,0);
		HashSet<String> set = new HashSet<>();
		for(int i=0; i<ans.length; i++){
			String to_add = Arrays.toString(ans[i]);
			set.add(to_add);
		}
		for (String ele : set) {
			System.out.println(ele.replaceAll("[,\\[\\]]", ""));
		}

	}
	public static int[][] get_all_subset(int[] input, int si){
		if(si>=input.length){
			return new int[1][0];
		}
		int[][] small_arr = get_all_subset(input, si+1);

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
