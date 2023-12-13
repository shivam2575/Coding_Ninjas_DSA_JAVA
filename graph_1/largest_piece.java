package graph_1;

import java.util.Arrays;

public class largest_piece {
        static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
	static int[][] visited;

	public static int dfs_helper(String[] edge, int x, int y, int[][] visited, int n){
		if(x<0 || y<0 || x>=n || y>=n){
			return 0;
		}
		if(visited[x][y]==1){
			return 0;
		}

		visited[x][y] = 1;
		int count=1;

		for(int i=0; i<4; i++){
			int new_x = x+dir[i][0];
			int new_y = y+dir[i][1];
			if(new_x>=0 && new_y>=0 && new_x<n && new_y<n && edge[new_x].charAt(new_y)=='1' && visited[new_x][new_y]==0){
				count += dfs_helper(edge, new_x, new_y, visited, n);
			}
		}

		return count;

	} 
	public static int dfs(String[] edge, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		visited = new int[n][n];
		for (int[] is : visited) {
			Arrays.fill(is, 0);
		}
		int max=0;

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(edge[i].charAt(j)=='1' && visited[i][j]==0){
					max = Math.max(max, dfs_helper(edge, i, j, visited, n));
				}
			}
		}

		return max;
	}
}
