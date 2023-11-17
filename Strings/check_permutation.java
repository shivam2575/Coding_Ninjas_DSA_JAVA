package Strings;

public class check_permutation {

    public static char[] toCharArray(String str){
		int n = str.length();
		char[] a = new char[n];
		for(int i=0; i<n; i++){
			a[i] = str.charAt(i);
		}
		return a;
	}

	public static void sort(char[] arr, int start, int end){
		if(start<end){
			int mid = (start+end)/2;

			sort(arr, start, mid);
			sort(arr, mid+1, end);

			merge(arr,start,mid,end);
		}
	}

	public static void merge(char[] arr, int start, int mid, int end){
		int n = mid-start+1;
		int m = end-mid;

		char[] a = new char[n];
		for(int i=0; i<n; i++){
			a[i] = arr[start+i];
		}

		char[] b = new char[m];
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

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
		int n = str1.length();
		int m = str2.length();

		if(n!=m){
			return false;
		}

		char[] a = toCharArray(str1);
		char[] b = toCharArray(str2);

		sort(a,0,n-1);
		sort(b,0,m-1);

		for(int i=0; i<n; i++){
			if(a[i]!=b[i]){
				return false;
			}
		}
        String str = "abc"; 
        StringBuffer sb = new StringBuffer();
        sb.append(str.charAt(0));

		return true;	
	}
    
}
