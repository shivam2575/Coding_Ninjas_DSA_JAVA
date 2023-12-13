package graph_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class get_path_dfs {
    	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		Scanner sc = new Scanner(System.in);
		String[] sp = sc.nextLine().split("\\s");
		int v = Integer.parseInt(sp[0]);
		int e = Integer.parseInt(sp[1]);
		if (v == 0) {
			return;
		}

		int[][] am = new int[v][v];
		for (int i = 0; i < e; i++) {
			sp = sc.nextLine().split("\\s");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			am[a][b] = 1;
			am[b][a] = 1;
		}

		sp = sc.nextLine().split("\\s");
		int x = Integer.parseInt(sp[0]);
		int y = Integer.parseInt(sp[1]);

		boolean[] visited = new boolean[v];
		ArrayList<Integer> ans = has_path(am, x, y, visited);
		if (ans != null) {
			for (int i : ans) {
				System.out.print(i + " ");
			}
		}

	}

	public static ArrayList<Integer> has_path(int[][] am, int x, int y, boolean[] visited) {
		if (x == y) {
			ArrayList<Integer> ans = new ArrayList<>();
			ans.add(x);
			return ans;
		}

		visited[x] = true;
		for (int i = 0; i < am[x].length; i++) {
			if (am[x][i] == 1 && !visited[i]) {
				ArrayList<Integer> small_ans = has_path(am, i, y, visited);
				if (small_ans != null) {
					small_ans.add(x);
					return small_ans;
				}
			}
		}
		return null;
	}
}
