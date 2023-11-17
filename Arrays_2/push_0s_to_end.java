package Arrays_2;

public class push_0s_to_end {
    public static void pushZeros(int[] arr, int n){
        for(int i=0,j=0; i<n; i++){
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,5,6,7,0};
        pushZeros(arr, arr.length);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
