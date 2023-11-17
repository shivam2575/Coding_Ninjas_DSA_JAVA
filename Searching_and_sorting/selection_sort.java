package Searching_and_sorting;

public class selection_sort {
    public static void selectionSort(int[] arr, int n) {
    	//Your code goes here
        int min = Integer.MAX_VALUE, minIndex=-1;

        for(int i=0; i<n-1; i++){
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            minIndex = -1;
            min = Integer.MAX_VALUE;
        }
    }
}
