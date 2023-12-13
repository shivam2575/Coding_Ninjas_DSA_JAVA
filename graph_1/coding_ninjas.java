package graph_1;

public class coding_ninjas {
    int solve(String[] Graph , int n, int m)
	{
		String WORD = "CODINGNINJA";
		char[][] board = new char[n][m];
		for(int i=0; i<Graph.length; i++){
			board[i] = Graph[i].toCharArray();
		}

		boolean[][] visited = new boolean[n][m];
		boolean flag = false;

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(board[i][j]==WORD.charAt(0)){
					flag = dfs(board,i,j,WORD,1,visited);
					if(flag){
						return 1;
					}
				}
			}
		}
		return 0;
	}

	public static boolean dfs(char[][] board, int x, int y, String word, int si, boolean[][] visited){
		if(si==word.length()){
			return true;
		}
		visited[x][y] = true;
		int[] diff_x = {-1,-1,-1,0,0,1,1,1};
		int[] diff_y = {-1,0,1,-1,1,-1,0,1};
		boolean found = false;

		for(int i=0; i<diff_x.length; i++){
			int curr_x = x+diff_x[i];
			int curr_y = y+diff_y[i];
			if(curr_x>=0 && curr_x<board.length && curr_y>=0 && curr_y<board[0].length && word.charAt(si)==board[curr_x][curr_y] && !visited[curr_x][curr_y]){
				found = found || dfs(board, curr_x, curr_y, word, si+1, visited);
			}
		}
		visited[x][y]=false;

		return found;
	}
}
