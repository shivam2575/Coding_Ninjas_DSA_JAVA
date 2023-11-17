/*
 * In this question i followed the approach of giving the number of pairs for every num-arr[i] and adding in final-output
 * the only mistake i did was that in case of same elements i was returning the answer directly insted of adding it to the final answer.
 */
package Time_complexity;

public class triplet_sum {
    public static void sort(int[] arr, int si, int ei){
		if(si>=ei){
			return;
		}
		int mid = (si+ei)/2;
		sort(arr,si,mid);
		sort(arr, mid+1, ei);
		merge(arr, si, mid, ei);
	}

	public static void merge(int[] arr, int si, int mid, int ei){
		int n = mid - si +1;
		int m = ei - mid;

		int[] arr1 = new int[n];
		int[] arr2 = new int[m];

		for(int i=0; i<n; i++){
			arr1[i] = arr[si+i];
		}

		for(int i=0; i<m; i++){
			arr2[i] = arr[mid+i+1];
		}

		int i=0, j=0, k=si;
		while(i<n && j<m){
			if(arr1[i]<=arr2[j]){
				arr[k] = arr1[i];
				i++;
			}
			else{
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

	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
		int n = arr.length, final_ans=0;
		sort(arr, 0, n-1);

		for(int i=0; i<n; i++){
			int temp_num = Math.abs(num-arr[i]);
			int pairs = 0;
			int si = i+1, ei = n-1;
			while(si<ei){
				int temp_sum = arr[si]+arr[ei];
				if(temp_sum<temp_num){
					si++;
				}
				else if(temp_sum>temp_num){
					ei--;
				}
				else{
					if(arr[si]==arr[ei]){
						int total_equal_value = ei-si+1;
						pairs+=(total_equal_value*(total_equal_value-1)/2);
						break;
					}
					int temp_si = si+1;
					int temp_ei = ei-1;
					while(temp_si<=temp_ei && arr[temp_si]==arr[si]){
						temp_si++;
					}
					while(temp_ei>=temp_si && arr[temp_ei]==arr[ei]){
						temp_ei--;
					}
					int si_count = temp_si - si;
					int ei_count = ei - temp_ei;
					pairs+=(si_count*ei_count);
					si=temp_si;
					ei=temp_ei; 
				}
			}
			final_ans+=pairs;
		}
		return final_ans;
	}
}
