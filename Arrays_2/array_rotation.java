package Arrays_2;

public class array_rotation {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr, int start, int end){
        for(int i=start, j=end-1; i<=j; i++,j--){
            swap(arr, i, j);
        }
    }
    public static void rotateRight(int arr[], int x, int n){
        reverse(arr, 0, n);
        reverse(arr, 0, x);
        reverse(arr, x, n);   
    }

    public static void rotateLeft(int arr[], int x, int n){
        reverse(arr, 0, n);
        System.out.print("reverse of 0 to n: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        reverse(arr, 0, n-x);
        System.out.print("reverse of 0 to n-x: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        reverse(arr, n-x, n);   
        System.out.print("reverse of n-x to n: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] rotateArray(int []a, int x, String dir) {
        // Write your code here.
        int n = a.length;
        System.out.println("length of arr: "+n);
        x = x%n;
        System.out.println("Value of x: "+x);

        if(dir=="LEFT"){
            rotateLeft(a, x, n);
        } else{
            rotateRight(a, x, n);
        }

        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        rotateArray(arr, 1, "LEFT");
        

    }
}
