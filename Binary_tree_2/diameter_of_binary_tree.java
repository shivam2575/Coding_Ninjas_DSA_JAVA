package Binary_tree_2;

import Binary_Tree_1.binary_tree_node;

public class diameter_of_binary_tree {
    public static int diameterOfBinaryTree(binary_tree_node<Integer> root){
		//Your code goes here
		if(root == null){
			return 0;
		}
		int left_height = height(root.left);
		int right_height = height(root.right);
		return 1+left_height+right_height;
	}

	public static int height(binary_tree_node<Integer> root){
		if(root==null){
			return 0;
		}
		int left_height = height(root.left);
		int right_height = height(root.right);
		return 1+Math.max(left_height, right_height);
	}
}
