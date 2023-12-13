package graph_1;

import java.util.ArrayList;

public class islands {
    	public static int numConnected(int[][] edges, int n) {
        
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		if(n==0){
            return 0;
        }
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        int[] temp = new int[n];
        for (int i=0; i<temp.length; i++) {
            temp[i]=-1;
        }
        boolean[] visited = new boolean[n];
        for(int i=0; i<visited.length; i++){
            if (!visited[i]) {
                dfs_helper(edges,i,visited);
                ArrayList<Integer> to_be_added = new ArrayList<>();
                for(int j=0; j<visited.length; j++) {
                    if(visited[j] && temp[j]==-1){
                        to_be_added.add(j);
                        temp[j]=0;
                    }
                }
                ans.add(to_be_added);
            }
        }
        return ans.size();
	}

	private static void dfs_helper(int[][] am, int si, boolean[] visited) {
        visited[si]=true;
        // System.out.print(si+" ");
        for(int i=0; i<am[si].length; i++){
            if(am[si][i]==1 && !visited[i]){
                dfs_helper(am, i, visited);
            }
        }
    }
}
