package Two_D_Arrays;

public class largest_row_or_coloumn {
    public static void findLargest(int mat[][]){
		//Your code goes here
		int rows = mat.length;
		if(rows==0){
			System.out.println("row 0 "+Integer.MIN_VALUE);
			return;
		}
		int cols = mat[0].length;
		int maxRowSum = 0, rowIndex = 0;
		int maxColSum = 0, colIndex = 0;
		int currSum = 0;

		//row_sum
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				currSum+=mat[i][j];
			}

			if(currSum>maxRowSum){
				maxRowSum = currSum;
				rowIndex = i;
			}
			currSum=0;
		}

		//col_sum
		for(int i=0; i<cols; i++){
			for(int j=0; j<rows; j++){
				currSum+=mat[j][i];
			}
			if(currSum>maxColSum){
				maxColSum = currSum;
				colIndex = i;
			}
			currSum = 0;
		}

		if(maxColSum>maxRowSum){
			System.out.println("column "+colIndex+" "+maxColSum);
		}else{
			System.out.println("row "+rowIndex+" "+maxRowSum);
		}
	}
}
