package Binary_Tree_1;

import java.util.LinkedList;
import java.util.Queue;

public class print_level_wise_binary_tree {
    public static void printLevelWise(binary_tree_node<Integer> root) {
		//Your code goes here
		if(root==null){
			return;
		}
		Queue<binary_tree_node<Integer>> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			binary_tree_node<Integer> temp = q.poll();
			System.out.print(temp.data+":");
        	if(temp.left!=null){
            	System.out.print("L:"+temp.left.data+",");
				q.add(temp.left);
        	}else{
				System.out.print("L:-1,");
			}
        	if(temp.right!=null){
            	System.out.print("R:"+temp.right.data);
				q.add(temp.right);
        	}else{
				System.out.print("R:-1");
			}
        	System.out.println();
		}
	}
}
