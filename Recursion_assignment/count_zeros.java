package Recursion_assignment;

public class count_zeros {
    public static int countZerosRec(int input){
		// Write your code here
		if(input==0){
			return 1;
		}
		else if(input<10){
			return 0;
		}

		int smallAns = countZerosRec(input/10);

		if(input%10==0){
			smallAns+=1;
		}
		return smallAns;
	}
}
