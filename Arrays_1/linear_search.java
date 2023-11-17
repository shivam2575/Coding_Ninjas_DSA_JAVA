package Arrays_1;

public class linear_search {
    public static int linearSearch(int arr[], int x) {
		//Your code goes here
    int n = arr.length;
    for(int i=0; i<n; i++){
      if(arr[i]==x){
        return i;
      }
    }
    return -1;
    }
}
