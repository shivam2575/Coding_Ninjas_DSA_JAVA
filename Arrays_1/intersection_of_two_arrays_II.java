package Arrays_1;

public class intersection_of_two_arrays_II {
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        int n = arr1.length;
        int m = arr2.length;
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr2[j]+" ");
                    arr2[j]=-1;
                    break;
                }
            }
        }
    }
}
