package Time_complexity;

public class Array_equilibrium_index {
    public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int n = arr.length, tsum=0, lsum=0, rsum=0;
		
		for(int i=0; i<n; i++){
			tsum+=arr[i];
		}

		for(int i=0; i<n; i++){
			rsum = tsum - lsum - arr[i];
            if(lsum==rsum){
                return i;
            }
            lsum+=arr[i]; 
		}

		return -1;
	}
}
