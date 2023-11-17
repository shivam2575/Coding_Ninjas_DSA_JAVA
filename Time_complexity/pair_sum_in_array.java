package Time_complexity;

public class pair_sum_in_array {
    public static void sort(int[] arr,int si, int ei){
		if(si>=ei){
			return;
		}
		int pivot = part(arr, si, ei);
		sort(arr,si,pivot-1);
		sort(arr,pivot+1,ei);
	}
	public static int part(int[] arr, int si, int ei){
		int pivot = arr[si], count=0;
		for(int i=si; i<=ei; i++){
			if(arr[i]<pivot){
				count++;
			}	
		}
		swap(arr, si, si+count);
		int i=si, j=ei;
		while(i<j){
			if(arr[i]<pivot){
				i++;
			}
			else if(arr[j]>=pivot){
				j--;
			}else{
				swap(arr,i,j);
				i++;
				j--;
			}
		}
		return si+count;
	}

	public static void swap(int[] arr, int si, int ei){
		int temp = arr[si];
		arr[si] = arr[ei];
		arr[ei] = temp;
	}

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
		
		int n = arr.length;
		sort(arr, 0, n-1);
		int i=0,j=n-1, pair=0;

		while(i<j){
			int sum = arr[i]+arr[j];
			if(sum<num){
				i++;
			}else if(sum>num){
				j--;
			}else{
				if(arr[i]==arr[j]){
					int total_equal_value = j-i+1;
					pair+=total_equal_value*(total_equal_value-1)/2;
					return pair;
				}

				int temp_si = i+1, temp_ei=j-1;
				while(temp_si<=temp_ei && arr[temp_si]==arr[i]){
					temp_si++;
				}

				while(temp_ei>=temp_si && arr[temp_ei]==arr[j]){
					temp_ei--;
				}

				int temp_si_count = temp_si-i;
				int temp_ei_count = j-temp_ei;
				pair+=(temp_si_count*temp_ei_count);

				i=temp_si;
				j=temp_ei;
			}
		}

		return pair;
	}
}
