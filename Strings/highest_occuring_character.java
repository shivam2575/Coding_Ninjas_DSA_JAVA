package Strings;

public class highest_occuring_character {
    public static void sort(char[] arr, int start, int end){
		if(start<end){
			int mid = (start+end)/2;
			sort(arr, start, mid);
			sort(arr, mid+1, end);

			merge(arr, start, mid, end);
		}
	} 

	public static void merge(char[] arr, int start, int mid, int end){
		int n = mid - start+1;
		int m = end - mid;

		char[] a = new char[n];
		char[] b = new char[m];

		for(int i=0; i<n; i++){
			a[i] = arr[start+i];
		}

		
		for(int i=0; i<m; i++){
			b[i] = arr[mid+1+i];
		}

		int i=0, j=0, k=start;
		while(i<n && j<m){
			if(a[i]<=b[j]){
				arr[k] = a[i];
				i++;
			}else{
				arr[k] = b[j];
				j++;
			}
			k++;
		}

		while(i<n){
			arr[k] = a[i];
			i++;
			k++;
		}

		while(j<m){
			arr[k] = b[j];
			j++;
			k++;
		}
	}

	public static char highestOccuringChar(String str) {
		//Your code goes here
		int n = str.length();
		char[] a = new char[n];
		for(int i=0; i<n; i++){
			a[i] = str.charAt(i);
		}

		sort(a,0,n-1);
		int currCount = 0, maxCount=Integer.MIN_VALUE;
		char ans = ' ';

		for(int i=0, j=0; j<n; j++){
			if(a[i]==a[j]){
				currCount++;
			} else{
				if(maxCount<currCount){
					maxCount = currCount;
					ans = a[i];
				}
				currCount = 1;
				i=j;
			}
		}

		if(currCount>maxCount){
			ans = a[n-1];
		}

		return ans;
	}
}
