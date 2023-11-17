package Recursion_2;

public class quick_sort {
    public static void quickSort(int[] input,int si, int ei) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		 if(si>=ei){
			 return;
		 }

		 int pivot = partition(input, si, ei);
		 quickSort(input, si, pivot-1);
		 quickSort(input, pivot+1, ei); 
	}

	public static int partition(int[] input, int si, int ei){
		int pivot = input[si], count=0;
		for(int i=si+1; i<=ei; i++){
			if(input[i]<pivot){
				count++;
			}
		}
		swap(input, si, si+count);
		int i=si,j=ei;
		while(i<j){
			if(input[i]<pivot){
				i++;
			}
			else if(input[j]>=pivot){
				j--;
			}
			else{
				swap(input, i, j);
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
}
