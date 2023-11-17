package Arrays_1;

public class sort_0_1 {
    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int i=0,j=0,n=arr.length;
        while(j<n){
            if(arr[j]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
    }
}
