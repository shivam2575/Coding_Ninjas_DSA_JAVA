package Searching_and_sorting;

public class count_small {
    public static int[] countS(int n, int m, int []a, int []b) {
        // Write your code here.
        int count = 0;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            int ele = a[i]; 
            for(int j=0; j<m; j++){
                if(b[j]<=ele){
                    count++;
                }
            }
            ans[i]=count;
            count=0;
        }

        return ans;
    }
}
