package Arrays_2;

public class check_array_rotation {
    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
