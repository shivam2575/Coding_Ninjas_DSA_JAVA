package graph_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class all_connected_components {
    	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();

		int[][] am = new int[v][v];
		for (int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			am[a][b] = 1;
			am[b][a] = 1;
		}

		ArrayList<ArrayList<Integer>> ans = dfs(am);
		for (ArrayList<Integer> curr_list : ans) {
			for (Integer i : curr_list) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static ArrayList<ArrayList<Integer>> dfs(int[][] am) {
		boolean[] visited = new boolean[am.length];
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		int[] temp = new int[am.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = -1;
		}
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				dfs_helper(am, i, visited);
				ArrayList<Integer> to_be_added = new ArrayList<>();
				for (int k = 0; k < visited.length; k++) {
					if (visited[k] && temp[k] == -1) {
						to_be_added.add(k);
						temp[k] = 0;
					}
				}
				ans.add(to_be_added);
			}
		}
		return ans;
	}

	public static void dfs_helper(int[][] am, int si, boolean[] visited) {
		visited[si] = true;
		for (int i = 0; i < am[si].length; i++) {
			if (am[si][i] == 1 && !visited[i]) {
				dfs_helper(am, i, visited);
			}
		}
	}
}
