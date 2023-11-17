package Arrays_1;

public class find_duplicate {
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int dup = 0;
        int n = arr.length, count=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==2){
                dup = arr[i];
                break;
            }
            count=0;
        }
        return dup;
    }
}
