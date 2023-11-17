package Binary_tree_2;

import java.util.LinkedList;
import java.util.Queue;

import Binary_Tree_1.binary_tree_node;

public class Level_order_traversal {
    public static void printLevelWise(binary_tree_node<Integer> root) {
		//Your code goes herei
		if(root==null){
			return;
		}
		Queue<binary_tree_node<Integer>> q = new LinkedList<>();
		q.add(root);
		q.add(null);

		while(!q.isEmpty()){
			binary_tree_node<Integer> curr = q.poll();
			if(curr==null){
				if(q.isEmpty()){
					return;
				}
				System.out.println();
				q.add(null);
			}else{
				if(curr.left!=null){
					q.add(curr.left);
				}
				if(curr.right!=null){
					q.add(curr.right);
				}
				System.out.print(curr.data+" ");
			}
		}
	}
}
