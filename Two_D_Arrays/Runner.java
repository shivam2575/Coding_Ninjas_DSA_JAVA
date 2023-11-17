package Two_D_Arrays;

import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);
	
	public static int[][] takeInput(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int[][] input = takeInput();
		Solution.print2DArray(input);
	}
}
