package graph_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class get_path_bfs {
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

	public static ArrayList<Integer> has_path(int[][] am, int x, int y, boolean[] visited){
		Queue<Integer> q = new LinkedList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();
		
		q.add(x);
		visited[x]=true;
		map.put(x, -1);

		while(!q.isEmpty()){
			int curr = q.remove();
			for(int i=0; i<am[curr].length; i++){
				if(am[curr][i]==1 && !visited[i]){
					if(i==y){
						ans.add(i);
						map.put(i, curr);
						int temp = map.get(i);
						while(temp!=-1){
							ans.add(temp);
							temp = map.get(temp);
						}
						return ans;
					}else{
						map.put(i, curr);
						q.add(i);
						visited[i]=true;
					}
				}
			}
		}

		return ans;
	}
}
