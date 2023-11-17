package Two_D_Arrays;

public class row_wise_sum {
    public static void rowWiseSum(int[][] mat) {
		//Your code goes here
		int n = mat.length;
		if(n==0){
			return;
		}
		int m = mat[0].length;
		int sum = 0;

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				sum+=mat[i][j];
			}
			System.out.print(sum+" ");
			sum=0;
		}

		System.out.println();

	}
}
