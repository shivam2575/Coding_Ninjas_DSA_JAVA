package Dynamic_programming_2;

public class maximum_square_matrix_with_all_zeros {
    public static int findMaxSquareWithAllZeros(int[][] input){
        
        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
         int n = input.length;
         if(n==0){
             return 0;
         }
         int m = input[0].length;
         int[][] dp = new int[n][m];
         for(int i=0; i<n; i++){
             if(input[i][0]==0){
                 dp[i][0] = 1;
             }else{
                 dp[i][0] = 0;
             }
         }
    
         for(int i=0; i<m; i++){
             if(input[0][i]==0){
                 dp[0][i] = 1;
             }else{
                 dp[0][i] = 0;
             }
         }
        int max = 0;
         for(int i=1; i<n; i++){
             for(int j=1; j<m; j++){
                 if(input[i][j]==1){
                     dp[i][j]=0;
                 }else{
                     int curr = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                     dp[i][j]=curr+1;
                 }
                 if(dp[i][j]>max){
                     max = dp[i][j];
                 }
             }
         }
    
         return max;
        
        }
}
