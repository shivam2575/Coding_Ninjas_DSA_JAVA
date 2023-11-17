package Recursion_assignment;

public class sum_of_digits {
    public static int sumOfDigits(int input){
		// Write your code here
		if(input==0){
			return 0;
		}

		int sum = sumOfDigits(input/10);

		return sum+input%10;

	}
}
