package Recursion_assignment;

public class multiplication_recursive {
    public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(n==0){
			return 0;
		}

		int smallAns = multiplyTwoIntegers(m, n-1);

		return smallAns+m;
	
	}
}
