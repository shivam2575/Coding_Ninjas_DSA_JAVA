package Dynamic_programming_1;

public class stair_case_iterative_dp {
    public static long staircase(int n) {
		//Your code goes here
		if(n==0){
			return 1;
		}
		if(n==1||n==2){
			return n;
		}
		long[] arr = new long[n+1];
		arr[0]=1;
		arr[1]=1;
		arr[2]=2;

		for(int i=3; i<=n; i++){
			arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
		}
		return arr[n];
	}
}

