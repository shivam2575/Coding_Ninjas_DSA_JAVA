package Test_3;

import java.util.ArrayList;

import Binary_search_tree_1.BinaryTreeNode;

public class longest_leaf_to_root_path {
    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
		// Write your code here
		if(root==null){
			return new ArrayList<>();
		}
		ArrayList<Integer> left_ans = longestRootToLeafPath(root.left);
		ArrayList<Integer> right_ans = longestRootToLeafPath(root.right);

		if(left_ans.size()<right_ans.size()){
			right_ans.add(root.data);
			return right_ans;
		}else{
			left_ans.add(root.data);
			return left_ans;
		}
	}
}
