package Two_D_Arrays;

public class query_and_matrix {
    public static int[] query(int[][] mat, int m, int n, String[] q) {
		// Write your code here.
		int count = 0, k=0;
		for(int i=0; i<q.length; i++){
			int ops = q[i].charAt(0)-'0';
			if(ops==2){
				count++;
			}	
		}
		int[] ans = new int[count];
		count=0;
		for(int i=0; i<q.length; i++){
			int ops = q[i].charAt(0)-'0';
			char on = q[i].charAt(1);
			int index = q[i].charAt(2)-'0';

			//ops 1
			if(ops==1){
				if(on=='R'){
					for(int j=0; j<n; j++){
						mat[index][j] = mat[index][j]^1;
					}
				} else{
					for(int j=0; j<m; j++){
						mat[j][index] = mat[j][index]^1;
					}
				}
			}
			else{
				//ops 2
				if(on=='R'){
					for(int j=0; j<n; j++){
						if(mat[index][j]==0){
							count++;
						}
					}
					ans[k] = count;
					count=0;
				}else{
					for(int j=0; j<m; j++){
						if(mat[j][index]==0){
							count++;
						}
					}
					ans[k]=count;
					count=0;
				}
				k++;
			}
		}
		return ans;
	}
}
