package Recursion_2;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(binary_search(arr,9, 0, 4));
    }

    private static int binary_search(int[] arr, int x, int si, int ei) {
        if(si>ei){
            return -1;
        }
        int mid = (si+ei)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]>x){
            return binary_search(arr,x,si,mid-1);
        }
        else{
           return binary_search(arr, x, mid+1, ei);
        }
        
    }
}
