package Dynamic_programming_2;

public class subset_sum_recursive {
    static boolean isSubsetPresent(int[] arr, int n, int sum) {

        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        return help(arr, n, sum, 0);
    }
    public static boolean help(int[] arr, int n, int sum, int si){
        if(si>=n){
            if(sum==0){
                return true;
            }
            return false;
        }
        if(sum==0){
            return true;
        }
        if(sum<0){
            return false;
        }

        return help(arr, n, sum, si+1) || help(arr, n, sum-arr[si], si+1);
    }
}
