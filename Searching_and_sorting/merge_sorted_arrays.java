package Searching_and_sorting;

public class merge_sorted_arrays {
    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int i=0,j=0,k=0;
        int n = arr1.length, m = arr2.length;

        int ans[] = new int[n+m];

        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                ans[k] = arr1[i];
                i++;
            }else{
                ans[k]=arr2[j];
                j++;
            }
            k++;
        }
        if(i==n){
            while(j<m){
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }else{
            while(i<n){
                ans[k]=arr1[i];
                i++;
                k++;
            }
        }

        return ans;
    }
}
