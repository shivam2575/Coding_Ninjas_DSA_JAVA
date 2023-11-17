package Searching_and_sorting;

public class swap_0_1_2 {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort012(int[] arr){
    	//Your code goes here
        int n = arr.length;
        int start = 0, end = n-1;

        for(int i=0; i<=end; ){
            if(arr[i]==0){
                swap(arr,i,start);
                start++;
                i++;
            } else if(arr[i]==2){
                swap(arr,i,end);
                end--;
            }else{
                i++;
            }
        }
    }
}
