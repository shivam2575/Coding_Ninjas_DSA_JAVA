package Arrays_1;

public class find_unique {
    public static int findUnique(int[] arr){
		//Your code goes here
    int count = 0;
    int n = arr.length;
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        if(arr[j]==arr[i]){
          count++;
        }
      }
      if(count==1){
        return arr[i];
      }
      count=0;
    }

    return 0;
    }
}
