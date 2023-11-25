package Backtracking;

public class rat_in_a_maze_all_path {
    static void ratInAMaze(int maze[][], int n) {
		 int[][] path = new int[n][n];
		 help(maze,path,0,0,n);
	}

	public static void help(int[][] maze, int[][] path, int x, int y, int n){
		if(x<0 || x>=n || y<0 || y>=n || maze[x][y]==0 || path[x][y]==1){
			return;
		}
		path[x][y]=1;
		if(x==n-1 && y==n-1){
			// print_path
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					System.out.print(path[i][j]+" ");
				}
			}
			System.out.println();
			path[x][y]=0;
			return;
		}
		
		help(maze, path, x-1, y, n);

		help(maze, path, x, y+1, n);

		help(maze, path, x+1, y, n);

		help(maze, path, x, y-1, n);

		path[x][y]=0;
		
	}
}
