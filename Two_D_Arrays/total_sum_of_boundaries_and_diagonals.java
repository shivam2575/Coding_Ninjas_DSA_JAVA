package Two_D_Arrays;

public class total_sum_of_boundaries_and_diagonals {
    public static void totalSum(int[][] mat) {
		//Your code goes here
		if(mat.length==0){
			System.out.println(0);
			return;
		}
		int firstRow = 0, firstCol = 0, lastRow = mat.length-1, lastCol = mat[0].length-1;
		int sum = 0;


		//firstRow
		for(int i=firstCol; i<=lastCol; i++){
			sum+=mat[firstRow][i];
		}
		firstRow++;

		//lastRow
		for(int i=firstCol; i<=lastCol; i++){
			sum+=mat[lastRow][i];
		}
		lastRow--;

		//firstCol
		for(int i=firstRow; i<=lastRow; i++){
			sum+=mat[i][firstCol];
		}
		firstCol++;

		//lastCol
		for(int i=firstRow; i<=lastRow; i++){
			sum+=mat[i][lastCol];
		}
		lastCol--;

		//diagonal1
		for(int i=firstRow, j=firstCol; i<=lastRow && j<=lastCol; i++, j++){
			sum+=mat[i][j];
		}

		//diagonal2
		for(int i=firstRow, j=lastCol; i<=lastRow && j>=firstCol; i++, j--){
			sum+=mat[i][j];
		}

		if(mat.length%2!=0){
			sum = sum - mat[mat.length/2][mat.length/2];
		}

		System.out.println(sum);

	}
}
