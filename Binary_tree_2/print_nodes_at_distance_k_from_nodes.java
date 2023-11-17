package Binary_tree_2;

import Binary_Tree_1.binary_tree_node;

public class print_nodes_at_distance_k_from_nodes {
    public static void nodesAtDistanceK(binary_tree_node<Integer> root, int node, int k) {
	    //Your code goes here
		if(root==null){
			return;
		}
		nodesAtDistanceK_helper(root,node,k);
	}

	public static int nodesAtDistanceK_helper(binary_tree_node<Integer> root, int node, int k) {
	    //Your code goes here
		if(root==null){
			return -1;
		}
		if(root.data == node){
			print_depth(root,k);
			return 0;
		}
		int ld = nodesAtDistanceK_helper(root.left,node,k);
		if(ld!=-1){
			if(ld+1==k){
				System.out.println(root.data);
			}else{
				k = k-ld-2;
				print_depth(root.right,k);
			}
			return 1+ld;
		}

		int rd = nodesAtDistanceK_helper(root.right,node,k);
		if(rd!=-1){
			if(rd+1==k){
				System.out.println(root.data);
			}else{
				k = k-rd-2;
				print_depth(root.left,k);
			}
			return 1+rd;
		}
		return -1;
	}

	public static void print_depth(binary_tree_node<Integer> root, int k){
		if(root==null){
			return;
		}
		if(k==0){
			System.out.println(root.data);
			return;
		}
		print_depth(root.left, k-1);
		print_depth(root.right, k-1);
	}
}
