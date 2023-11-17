package Recursion_1;

public class number_of_digits {
    public static int count(int n){
		//Write your code here
		if(n==0){
			return 0;
		}
		int smallAns = count(n/10);
		return smallAns+1;
    }
}
