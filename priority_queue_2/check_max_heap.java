package priority_queue_2;

public class check_max_heap {
    public static boolean checkMaxHeap(int arr[]) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		 for(int i=1; i<arr.length; i++){
			 int child_index = i;
			 int parent_index = (child_index-1)/2;
			 if(arr[child_index]>arr[parent_index]){
				 return false;
			 }
		 }

		 return true;
	}
}
