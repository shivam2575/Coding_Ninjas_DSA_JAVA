package Arrays_1;

public class arrange_numbers_in_array {
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        for(int i=0,j=n-1,x=1; x<=n; x++){
            if(x%2!=0){
                arr[i]=x;
                i++;
            }else{
                arr[j]=x;
                j--;
            }
        }
    }
}
