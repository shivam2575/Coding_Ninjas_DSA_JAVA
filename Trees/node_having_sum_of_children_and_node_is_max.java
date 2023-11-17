package Trees;

import javax.swing.tree.TreeNode;

public class node_having_sum_of_children_and_node_is_max {
    public static tree_node<Integer> maxSumNode(tree_node<Integer> root){
		// Write your code here
		if(root==null){
			return null;
		}
		int max_sum = sum(root);
		tree_node<Integer> ans = root;
		for(int i=0;i<root.children.size(); i++){
			tree_node<Integer> curr_ans = maxSumNode(root.children.get(i));
			int curr_sum = sum(curr_ans);
			if(max_sum<curr_sum){
				max_sum = curr_sum;
				ans = curr_ans;
			}
		}

		return ans; 
	}
    public static int sum(tree_node<Integer> root){
		if(root==null){
			return 0;
		}
		int sum = root.data;
		for(int i=0; i<root.children.size(); i++){
			sum+=root.children.get(i).data;
		}
		return sum;
	}
}
