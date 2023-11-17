package Two_D_Arrays;

public class transpose_of_matrix {
    public static int[][] transpose(int m, int n, int[][] mat) {
		// Write your code here
		int[][] ans = new int[n][m];

		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				ans[j][i] = mat[i][j];
			}
		}

		return ans;
	}

    public static void main(String[] args) {
        System.out.println(1^1);
    }
}
