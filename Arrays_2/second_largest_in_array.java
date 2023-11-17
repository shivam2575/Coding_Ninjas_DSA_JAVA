package Arrays_2;

public class second_largest_in_array {
    public static void sort(int[] arr, int l, int r){
        if(l<r){
            int m = l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);

            merge(arr,l,m,r);

        }
    }

    public static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r-m;

        int a[] = new int[n1];
        for(int i=0; i<n1; i++){
            a[i] = arr[l+i];
        }

        int b[] = new int[n2];
        for(int i=0; i<n2; i++){
            b[i] = arr[m+1+i];
        }

        int i=0, j=0, k=l;

        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                i++;
            }else{
                arr[k]=b[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = a[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=b[j];
            j++;
            k++;
        }
    }

    public static int secondLargestElement(int[] arr, int n) {
    	//Your code goes here
        sort(arr,0,n-1);
        return arr[n-2];
    }

}
