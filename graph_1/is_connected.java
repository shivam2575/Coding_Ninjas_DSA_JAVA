package graph_1;

import java.io.IOException;
import java.util.Scanner;

public class is_connected {
    	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();

		if(v==0){
			System.out.println(true);
			return;
		}

		int[][] am = new int[v][v];
		for (int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			am[a][b] = 1;
			am[b][a] = 1;
		}
		boolean[] visited = new boolean[v];
		is_connected(am,0,visited);
		for (boolean b : visited) {
			if(!b){
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}

	public static void is_connected(int[][] am, int si, boolean[] visited){
		visited[si]=true;
		for(int i=0; i<am[si].length; i++){
			if(am[si][i]==1 && !visited[i]){
				is_connected(am, i, visited);
			}
		}
	}
}
