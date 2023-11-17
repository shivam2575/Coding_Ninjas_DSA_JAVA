package Searching_and_sorting;

public class find_pair_with_smallest_difference {
    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        // Write your code here.
        sort(arr1);
        sort(arr2);

        int min = Integer.MAX_VALUE;

        for(int i=0, j=0; i<n && j<m; ){
            int diff = Math.abs(arr1[i]-arr2[j]);
            if(diff<min){
                min = diff;
            }
            if(arr1[i]<=arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        return min;
    }

    public static void sort(int[] arr){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                    j--;
                }else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }
}
