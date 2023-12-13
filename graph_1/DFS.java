package graph_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
    public static ArrayList<ArrayList<Integer>> dfs(int[][] am){
        int v = am.length;
        if(v==0){
            return null;
        }
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        int[] temp = new int[v];
        for (int i=0; i<temp.length; i++) {
            temp[i]=-1;
        }
        boolean[] visited = new boolean[v];
        for(int i=0; i<visited.length; i++){
            if (!visited[i]) {
                dfs_helper(am,i,visited);
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
        return ans;
        
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

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		 Scanner sc = new Scanner(System.in);
		 int v = sc.nextInt();
		 int e = sc.nextInt();

		 if(v==0){
			 return;
		 }

		 int[][] am = new int[v][v];

		 for(int i=0; i<e; i++){
			 int a = sc.nextInt();
			 int b = sc.nextInt();
			 am[a][b] = 1;
			 am[b][a] = 1;
		 } 

		ArrayList<ArrayList<Integer>> ans =  dfs(am);
        for (ArrayList<Integer> arrayList : ans) {
            System.out.println(arrayList);
        }
	}
}
