package Test_1;

public class split_array {
    public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		int sum_right=0, sum_left=0, si=0, ei=input.length-1;
		return split(input, si, ei, sum_right, sum_left);
		
	}

	public static boolean split(int[] arr, int si, int ei, int sum_right, int sum_left){
		if(si<=ei){
			if(arr[si]%3==0 && arr[si]%5!=0){
				sum_left+=arr[si];
				return split(arr, si+1, ei, sum_right, sum_left);
			}
			else if(arr[si]%5==0){
				sum_right+=arr[si];
				return split(arr, si+1, ei, sum_right, sum_left);
			}
			else{
				return split(arr, si+1, ei, sum_right+arr[si], sum_left) || split(arr, si+1, ei, sum_right, sum_left+arr[si]);
			}
		}
		return sum_left==sum_right;
	}
}
