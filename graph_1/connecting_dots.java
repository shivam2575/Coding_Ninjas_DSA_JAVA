package graph_1;

import java.util.Arrays;

public class connecting_dots {
    	int[] dx = {-1,1,0,0};
	int[] dy = {0,0,-1,1};
	int[][] visited;
	int found = 0;


	void dfs(String[] board, int x, int y, int from_x, int from_y, char dot, int n, int m){
		if(x<0 || y<0 || x>=n || y>=m){
			return;
		}
		if(board[x].charAt(y)!=dot){
			return;
		}

		if(visited[x][y]==1){
			found=1;
			return;
		}

		visited[x][y]=1;
		for(int i =0; i<4; i++){
			int next_x = x+dx[i];
			int next_y = y+dy[i];
			if(next_x==from_x && next_y==from_y){
				continue;
			}
			dfs(board, next_x, next_y, x, y, dot, n, m);
		}
	}
    int solve(String[] board , int n, int m)
	{
		visited = new int[n][m];

		for (int i = 0; i<n; i++) {
			Arrays.fill(visited[i], 0);
		}

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(visited[i][j]==0){
					dfs(board, i, j, -1, -1, board[i].charAt(j), n, m);
				}
			}
		}
		return found;
	}
}
