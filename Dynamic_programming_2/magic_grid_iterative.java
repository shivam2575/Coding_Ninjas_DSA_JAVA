package Dynamic_programming_2;

import java.util.Arrays;

public class magic_grid_iterative {
    public static int getMinimumStrength(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;

        int[][] dp = new int[row+1][col+1];
        for(int[] rows: dp){
            Arrays.fill(rows, Integer.MAX_VALUE);
        }
        dp[row-1][col]=1;
        dp[row][col-1]=1;

        for(int i=row-1; i>=0; i--){
            for(int j=col-1; j>=0; j--){
                int curr = Math.min(dp[i+1][j], dp[i][j+1])-grid[i][j];
                if(curr<=0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j]=curr;
                }
            }
        }
        return dp[0][0];
    }
}
