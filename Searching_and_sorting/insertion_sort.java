package Searching_and_sorting;

public class insertion_sort {
    public static void insertionSort(int[] arr, int n) {
    	//Your code goes here
        boolean flag = false;

        for(int i=1; i<n; i++){
            int ele = arr[i];
            for(int j=i-1; j>=0; j--){
                if(arr[j]>ele){
                    arr[j+1] = arr[j];
                }else{
                    arr[j+1] = ele;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                arr[0] = ele;
            }
            flag = false;
        }
    }
}
