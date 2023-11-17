package Recursion_2;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr = {5,3,10,88,3,1,0};
        mergeSort(arr,0,6);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void mergeSort(int[] arr, int si, int ei) {
        if(si<ei){
            int mid = (si+ei)/2;
            mergeSort(arr, si, mid);
            mergeSort(arr, mid+1, ei);
            merge(arr,si,mid,ei);
        }
    }

    private static void merge(int[] arr, int si, int mid, int ei) {
        int n1 = mid - si+1;
        int n2 = ei-mid;
        
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i]=arr[i+si];
        }

        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i]=arr[i+mid+1];
        }

        int i=0, j=0, k=si;
        while(i<n1&&j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
            }else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }
}
