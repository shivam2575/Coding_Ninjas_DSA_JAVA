package Recursion_assignment;

public class staircase {
    public static int staircase(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
	 if(n<0){
		 return 0;
	 }
	 if(n==0){
		 return 1;
	 }

	 int ans1 = staircase(n-1);
	 int ans2 = staircase(n-2);
	 int ans3 = staircase(n-3);

	 return ans1+ans2+ans3;

	}
}
