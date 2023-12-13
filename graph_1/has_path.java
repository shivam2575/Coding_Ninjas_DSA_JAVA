package graph_1;

import java.io.IOException;
import java.util.Scanner;

public class has_path {
    	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		if (v == 0) {
			System.out.println(false);
		}

		int[][] am = new int[v][v];
		for (int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			am[a][b] = 1;
			am[b][a] = 1;
		}

		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean[] visited = new boolean[v];

		System.out.println(dfs(am, x, y, visited));
	}

	public static boolean dfs(int[][] am, int x, int y, boolean[] visited) {
		if (x == y) {
			return true;
		}
		visited[x] = true;
		for (int i = 0; i < am[x].length; i++) {
			if (am[x][i] == 1 && !visited[i]) {
				if(dfs(am, i, y, visited)){
					return true;
				}
			}
		}
		return false;
	}
}
