package Arrays_2;

public class reverse_array_between_2_index {
    public static int[] reverseBetween(int n, int l, int r, int []arr) {
        // Write your code from here.
        for(int i=l, j=r; i<j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }
}
