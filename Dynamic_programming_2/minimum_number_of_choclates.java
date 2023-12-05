package Dynamic_programming_2;

public class minimum_number_of_choclates {
    public static int getMin(int arr[], int N){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		//filling left to right
		int left[] = new int[N];
		for(int i=0; i<N; i++){
			left[i]=1;
		}
		for(int i=1; i<N; i++){
			if(arr[i]>arr[i-1]){
				left[i] = left[i-1]+1;
			}
		}

		//filling right to left
		int right[] = new int[N];
		for(int i=0; i<N; i++){
			right[i]=1;
		}
		for(int i=N-2; i>=0; i--){
			if(arr[i]>arr[i+1]){
				right[i] = right[i+1]+1;
			}
		}

		//adding choclates
		int sum = 0;
		for(int i=0; i<N; i++){
			sum+=Math.max(left[i], right[i]);
		}

		return sum;  
    }
}
