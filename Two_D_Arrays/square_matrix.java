package Two_D_Arrays;

public class square_matrix {
    public static String sqrMat(int [][]mat, int n, int m,int diag[]) 
{
        // Write your code here.
        String ans = "";
        if(n==m){
            ans="YES";
        }else{
            return "NO";
        }

        if(ans.equals("YES")){
            for(int i=0; i<n; i++){
                diag[i]=mat[i][i];
            }
        }

        return ans;
    }
}
