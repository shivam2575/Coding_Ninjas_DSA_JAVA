package Time_complexity;

public class rotate_array {
    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n = arr.length;
        reverse(arr,0,n);
        reverse(arr,0,n-d);
        reverse(arr,n-d,n);
    }

    public static void reverse(int[] arr, int si, int ei){
        int i=si, j=ei-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
