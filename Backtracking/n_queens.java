package Backtracking;

public class n_queens {
    public static void placeNQueens(int n) {
		int[][] path = new int[n][n];
		help(path, n, 0);
	}

	public static void help(int[][] path, int n, int x) {
		if (x == n) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(path[i][j] + " ");
				}
			}
			System.out.println();
			return;
		}
		for(int j=0; j<n; j++){
			if(is_safe(path,n,x,j)){
				path[x][j]=1;
				help(path,n,x+1);
				path[x][j]=0;
			}
		}
	}
	public static boolean is_safe(int[][] path, int n, int x, int y){
		for(int i=x-1, j=y-1; i>=0 && j>=0; i--, j--){
			if(path[i][j]==1){
				return false;
			}
		}

		for(int i=x-1, j=y+1; i>=0 && j<n; i--, j++){
			if(path[i][j]==1){
				return false;
			}
		}

		for(int i=x-1; i>=0; i--){
			if(path[i][y]==1){
				return false;
			}
		}

		return true;
	}
}
