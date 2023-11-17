package Test_1;

public class maximum_profit_on_app{
    public static void sort(int[] arr, int si, int ei){
		if(si>=ei){
			return;
		}
		int pivot = part(arr, si, ei);
		sort(arr, si, pivot-1);
		sort(arr, pivot+1, ei);
	}

	public static int part(int[] arr, int si, int ei){
		int pivot = arr[si], count=0;

		for(int i=si+1; i<=ei; i++){
			if(arr[i]<pivot){
				count++;
			}
		}

		swap(arr,si,si+count);

		int i=si, j=ei;
		while(i<j){
			if(arr[i]<pivot){
				i++;
			}
			else if(arr[j]>=pivot){
				j--;
			}
			else{
				swap(arr,i,j);
				i++;
				j--;
			}
		}

		return si+count;
	}

	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp; 
	}

	public static int maximumProfit(int budget[]) {
		// Write your code here
		int n = budget.length;
		sort(budget, 0, n-1);
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			max = Math.max(budget[i]*(n-i), max);
		}
		return max;
	}
}