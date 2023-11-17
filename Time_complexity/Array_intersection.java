package Time_complexity;

public class Array_intersection {
    public static void sort(int[] arr, int si, int ei){
		if(si>=ei){
			return;
		}
		int pivot = partition(arr,si,ei);
		sort(arr, si, pivot-1);
		sort(arr, pivot+1, ei);
	}

	public static int partition(int[] arr, int si, int ei){
		int pivot = arr[si];
		int count = 0;
		for(int i=si; i<=ei; i++){
			if(arr[i]<pivot){
				count++;
			}
		}
		swap(arr, si+count, si);

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

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		int n = arr1.length;
		int m = arr2.length;
		if(n==0 || m==0){
			return;
		}

		sort(arr1, 0, n-1);
		sort(arr2, 0, m-1);
		

		int i=0, j=0;
		while(i<n && j<m){
			if(arr1[i]==arr2[j]){
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j]){
				i++;
			}else{
				j++;
			}
		}
	}
}
