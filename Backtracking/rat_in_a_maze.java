package Backtracking;

public class rat_in_a_maze {
    public static boolean ratInAMaze(int maze[][]){
		int n = maze.length;
		int[][] path = new int[n][n];
		return help(maze,path,0,0,n);
	}

	public static boolean help(int maze[][], int path[][], int x, int y, int n){
		if(x==n-1 && y==n-1){
			return true;
		}
		if(x>=n || y>=n || x<0 || y<0){
			return false;
		}
		boolean t = false, r = false, b = false, l = false;
		if(maze[x][y]==1 && path[x][y]==0){
			path[x][y]=1;
			t = help(maze, path, x-1, y, n);
			r = help(maze, path, x, y+1, n);
			b = help(maze, path, x+1, y, n);
			l = help(maze, path, x, y-1, n);
		}
		return t||r||b||l;
	}
}
