package Searching_and_sorting;

public class bubble_sort {
    public static void bubbleSort(int[] arr, int size){
        //Your code goes here
        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
