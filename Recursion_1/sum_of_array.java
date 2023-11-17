package Recursion_1;

public class sum_of_array {
    public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(input.length==0){
			return 0;
		}
		int[] arr = new int[input.length-1];
		for(int i=0; i<arr.length; i++){
			arr[i] = input[i+1];
		}
		int smallSum = sum(arr);
		return smallSum+input[0];
	}
}
