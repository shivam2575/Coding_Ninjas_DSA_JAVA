package priority_queue_2;

public class inplace_heap_sort {
    public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
		int n = arr.length;
		if(n<2){
			return;
		}
		for(int i=(n/2)-1; i>=0; i--){
			down_heapify(arr,i,n);
		}
		
		for(int i=n-1; i>0; i--){
			int temp_ind = i;
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			down_heapify(arr,0,temp_ind);
		}		
	}

	public static void down_heapify(int[] arr, int i, int n){
		int parent_index = i;
		int left_child = 2*parent_index+1;
		int right_child = 2*parent_index+2;

		while(left_child<n){
			int min_index = parent_index;
			if(arr[min_index]>arr[left_child]){
				min_index = left_child;
			}
			if(right_child<n && arr[min_index]>arr[right_child]){
				min_index = right_child;
			}
			if(min_index==parent_index){
				break;
			}
			int temp = arr[min_index];
			arr[min_index] = arr[parent_index];
			arr[parent_index] = temp;

			parent_index = min_index;
			left_child = 2*parent_index+1;
			right_child = 2*parent_index+2;
		}
}
}
