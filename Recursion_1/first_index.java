package Recursion_1;

public class first_index {
    public static int newFirstIndex(int input[], int x, int si) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(si==input.length){
			return -1;
		}

		if(input[si]==x){
			return si;
		}

		return newFirstIndex(input,x,si+1);
		
	}
}
