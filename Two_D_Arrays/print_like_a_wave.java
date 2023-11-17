package Two_D_Arrays;

public class print_like_a_wave {
    public static void wavePrint(int mat[][]){
		//Your code goes here
		if(mat.length==0){
			return;
		}

		int rows = mat.length, cols = mat[0].length;
		for(int colNum = 0; colNum < cols; colNum++){
			if(colNum%2==0){
				for(int i = 0; i<rows; i++){
					System.out.print(mat[i][colNum]+" ");
				}
			}else{
				for(int i = rows-1; i>=0; i--){
					System.out.print(mat[i][colNum]+" ");
				}
			}
		}
	}
}
