package graph_2;

import java.util.Scanner;

public class dijkstra_algo {
    	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();

		int[][] am = new int[v][v];
		for(int i=0; i<e; i++){
			int a = s.nextInt();
			int b = s.nextInt();
			int wt = s.nextInt();
			am[a][b]=wt;
			am[b][a]=wt;
		}

		//call dijkstra's algo
		dijkstra(am,v);

	}

	public static void dijkstra(int[][] am, int n){
		boolean[] visited = new boolean[n];
		int[] dist = new int[n];
		dist[0]=0;
		for(int i=1; i<dist.length; i++){
			dist[i] = Integer.MAX_VALUE;
		}

		for(int i=0; i<n; i++){
			int curr_v = find_min(visited, dist);
			visited[curr_v]=true;
			for(int j=0; j<n; j++){
				if(am[curr_v][j]!=0 && !visited[j]){
					int curr_d = dist[curr_v]+am[curr_v][j];
					if(dist[j]>curr_d){
						dist[j]=curr_d;
					}
				}
			}
		}

		for(int i=0; i<n; i++){
			System.out.println(i+" "+dist[i]);
		}

	}

	public static int find_min(boolean[] visited, int[] distance){
		int min_vertex = -1;
		for(int i=0; i<distance.length; i++){
			if(!visited[i] && (min_vertex==-1 || distance[i]<distance[min_vertex])){
				min_vertex=i;
			}
		}

		return min_vertex;
	}
}
