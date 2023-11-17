package Recursion_assignment;

public class geometric_sum {
    public static double findGeometricSum(int k){
		// Write your code here
		if(k==0){
			return 1;
		}

		double smallerSum = findGeometricSum(k-1);
		return smallerSum+(1/Math.pow(2,k));

	}
    
}
