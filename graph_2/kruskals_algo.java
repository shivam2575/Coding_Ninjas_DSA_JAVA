package graph_2;

import java.util.Arrays;
import java.util.Scanner;

public class kruskals_algo {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();

		/*
		 * Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		 //step1
		Edge[] arr = new Edge[E];
		for (int i = 0; i < E; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int weight = sc.nextInt();
			arr[i] = new Edge(v1, v2, weight);
		}

		//step 2
		Arrays.sort(arr);

		//step 3
		Edge[] mst = kruskal_algo(arr,V);

		//step 4
		for(Edge e: mst){
			if(e.v2<=e.v1){
				System.out.println(e.v2+" "+e.v1+" "+e.weight);
			}else{
				System.out.println(e.v1+" "+e.v2+" "+e.weight);
			}
			
		}
	}

	public static Edge[] kruskal_algo(Edge[] arr, int n){

		Edge[] mst = new Edge[n-1];
		int[] parent = new int[n];
		for(int i=0; i<n; i++){
			parent[i]=i;
		}

		int count = 0, i=0;
		while(count!=n-1){
			Edge curr_edge = arr[i++];
			int v1_parent = find_parent(curr_edge.v1, parent);
			int v2_parent = find_parent(curr_edge.v2, parent);

			if(v1_parent!=v2_parent){
				mst[count++]=curr_edge;
				parent[v1_parent]=v2_parent;
			}
		}

		return mst;
	}

	private static int find_parent(int v, int[] parent){
		if(v==parent[v]){
			return v;
		}

		return find_parent(parent[v], parent);
	}
    
}

class Edge implements Comparable<Edge>{
	int v1;
	int v2;
	int weight;

	Edge(int v1, int v2, int weight) {
		this.v1 = v1;
		this.v2 = v2;
		this.weight = weight;
	}

	public int compareTo(Edge e){
		return this.weight-e.weight;
	}
}
