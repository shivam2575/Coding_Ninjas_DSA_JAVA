package Time_complexity;

public class duplicate_in_array {
    public static void sort(int[] arr, int si, int ei){
		if(si>=ei){
			return;
		}

		int mid = (si+ei)/2;
		sort(arr, si, mid);
		sort(arr, mid+1, ei);
		merge(arr, si, mid, ei);
	}

	public static void merge(int[] arr, int si, int mid, int ei){
		int n = mid - si +1;
		int m = ei - mid;

		int[] arr1 = new int[n];
		for(int i=0; i<n; i++){
			arr1[i] = arr[si+i];
		}

		int[] arr2 = new int[m];
		for(int i=0;i<m;i++){
			arr2[i] = arr[mid+1+i];
		}

		int i=0, j=0, k=si;
		while(i<n && j<m){
			if(arr1[i]<=arr2[j]){
				arr[k] = arr1[i];
				i++;
			}else{
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}

		while(i<n){
			arr[k] = arr1[i];
			i++;
			k++;
		}

		while(j<m){
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}

	public static int findDuplicate(int[] arr) {
		//Your code goes here
		int n = arr.length;

		sort(arr, 0, n-1);

		for(int i=0; i<n-1; i++){
			if(arr[i]==arr[i+1]){
				return arr[i];
			}
		}

		return -1;
	}
}
