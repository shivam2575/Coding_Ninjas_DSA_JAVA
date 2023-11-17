package Two_D_Arrays;

public class Solution {

    public static void print2DArray(int[][] input) {
        int count = 0;
		int n = input.length;
		int m = input[0].length;

		for(int i=0; i<n; ){
			for(int j=0; j<m; j++){
				System.out.print(input[i][j]+" ");
			}
            System.out.println();
			count++;
			if(count+i==n){
				i++;
				count=0;
			}
		}
    }

}
