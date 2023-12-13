package graph_2;

import java.util.Scanner;

public class prims_algo {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		// adj matrix
		int[][] am = new int[V][V];
		for (int i = 0; i < E; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int wt = s.nextInt();
			am[v1][v2] = wt;
			am[v2][v1] = wt;
		}

		// call prim's
		prims(am, V);
	}

	public static void prims(int[][] am, int n) {
		// visited, parent & weight
		boolean[] visited = new boolean[n];
		int[] weight = new int[n];
		for (int i = 1; i < weight.length; i++) {
			weight[i] = Integer.MAX_VALUE;
		}
		int parent[] = new int[n];
		parent[0] = -1;
		weight[0] = 0;

		for(int i=0; i<n; i++){
			int curr_v = find_min_v(visited, weight);
			visited[curr_v]=true;
			//explore neighbores
			for(int j=0; j<n; j++){
				if(am[curr_v][j]!=0 && !visited[j] && weight[j]>am[curr_v][j]){
					//update weight& parent
					weight[j]=am[curr_v][j];
					parent[j]=curr_v;
				}
			}
		}

		//print mst
		for(int i=1; i<n; i++){
			if(i<parent[i]){
				System.out.println(i+" "+parent[i]+" "+weight[i]);
			}else{
				System.out.println(parent[i]+" "+i+" "+weight[i]);
			}
		}
	}

	public static int find_min_v(boolean[] visited, int[] weight){
		int min_v = -1;
		for(int i=0; i<visited.length; i++){
			if(!visited[i] && (min_v==-1 || weight[i]<weight[min_v])){
				min_v=i;
			}
		}
		return min_v;
	}
}
