package Binary_tree_2;

import Binary_Tree_1.binary_tree_node;

public class mirror_binary_tree {
    public static void mirrorBinaryTree(binary_tree_node<Integer> root){
		//Your code goes here
		if(root==null){
			return;
		}
		else if(root.left!=null && root.right!=null){
			binary_tree_node<Integer> temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		else if(root.left!=null){
			root.right = root.left;
			root.left = null;
		}
		else if(root.right!=null){
			root.left = root.right;
			root.right = null;
		}
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
	}
}
