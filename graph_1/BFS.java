package graph_1;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * BFS
 */
public class BFS {

    public static void bfs(int[][] am){
		boolean[] visited = new boolean[am.length];

		for(int i=0; i<visited.length; i++){
			if(!visited[i]){
				bfs_helper(am, i, visited);
			}	
		}
	}

	public static void bfs_helper(int[][] am, int si, boolean[] visited){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(si);
		visited[si]=true;

		while(!q.isEmpty()){
			int curr = q.poll();
			System.out.print(curr+" ");
			for(int i=0; i<am.length; i++){
				if(am[curr][i]==1 && !visited[i]){
					visited[i]=true;
					q.add(i);
				}
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

		 bfs(am);
	}
}