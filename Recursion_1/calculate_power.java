package Recursion_1;

public class calculate_power {
    public static int power(int x, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		 if(n==0){
			 return 1;
		 }
		 
		 int small_ans = power(x, n-1);

		 return x*small_ans;
		
	}
}
