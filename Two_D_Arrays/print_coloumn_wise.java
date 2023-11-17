package Two_D_Arrays;

public class print_coloumn_wise {
    public static int[] printColWise(int [][]a) {
        // Write your code here.
        int n = a.length;
        int m = a[0].length;
        int[] ans = new int[n*m];
        int count = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++, count++){
                ans[count] = a[j][i];
            }
        }

        return ans;
    }
}
