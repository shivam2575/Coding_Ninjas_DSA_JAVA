package Arrays_2;

public class move_all_negative_numbres {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] separateNegativeAndPositive(int a[]) {
        int n = a.length;

        for(int i=0,j=0; i<n; i++){
            if(a[i]<0){
                swap(a,i,j);
                j++;
            }
        }

        return a;

    }
}
