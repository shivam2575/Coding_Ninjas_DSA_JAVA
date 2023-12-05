package Dynamic_programming_2;

public class _0_1_knapsack_recursion {
    public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		//Your code goes here
		return help(weights, values, n, maxWeight, 0);
	}

	public static int help(int[] weights, int[] values, int n, int maxWeight, int wi){
		if(wi==n){
			return 0;
		}
		int ans;
		if(weights[wi]>maxWeight){
			ans = help(weights, values, n, maxWeight, wi+1);
		}else{
			int ans1 = values[wi]+help(weights, values, n, maxWeight-weights[wi], wi+1);
			int ans2 = help(weights, values, n, maxWeight, wi+1);

			ans = Math.max(ans1, ans2);
		}
		return ans;
	}
}
