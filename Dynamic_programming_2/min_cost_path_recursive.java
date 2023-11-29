package Dynamic_programming_2;

public class min_cost_path_recursive {
    public static int minCostPath(int[][] input) {
		//Your code goes here
		int row = input.length;
		int col = input[0].length;
		return help(input, 0,0,row,col);
	}
	public static int help(int[][] input, int i, int j, int row, int col) {
		//Your code goes here
		if(j>=col || i>=row){
			return Integer.MAX_VALUE;
		}
		if(i==row-1 && j==col-1){
			return input[i][j];
		}

		int right = help(input, i, j+1, row, col);
		int down = help(input, i+1, j, row, col);
		int diagonal = help(input, i+1, j+1, row, col);

		return input[i][j] + Math.min(right,Math.min(down, diagonal));
	}
}
