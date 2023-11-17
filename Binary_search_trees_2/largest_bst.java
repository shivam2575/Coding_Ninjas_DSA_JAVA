package Binary_search_trees_2;

import Binary_search_tree_1.BinaryTreeNode;

public class largest_bst {
    private static binary_tree largestBSTSubtree_helper(BinaryTreeNode<Integer> root) {
		// Write your code here
		if(root==null){
			binary_tree node = new binary_tree();
			node.height=0;
			node.max=Integer.MIN_VALUE;
			node.min=Integer.MAX_VALUE;
			node.isBst = true;
			return node;
		}
		binary_tree left_ans = largestBSTSubtree_helper(root.left);
		binary_tree right_ans = largestBSTSubtree_helper(root.right);
		int min = Math.min(root.data, Math.min(left_ans.min, right_ans.min));
		int max = Math.max(root.data, Math.max(left_ans.max, right_ans.max));
		boolean bst = false;
		int height = 0;
		if(left_ans.isBst && right_ans.isBst && root.data>left_ans.max && root.data<right_ans.min){
			bst = true;
			height = height(root);
		}else{
			height = Math.max(left_ans.height, right_ans.height);
		}
		binary_tree ans = new binary_tree();
		ans.min = min;
		ans.max = max;
		ans.isBst = bst;
		ans.height = height;
		return ans;
	}
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		if(root==null){
			return 0;
		}
		binary_tree ans = largestBSTSubtree_helper(root);
		return ans.height;
	}


	private static int height(BinaryTreeNode<Integer> root){
		if(root==null){
			return 0;
		}
		int height = Math.max(height(root.left), height(root.right));
		return 1+height;
	}
}

class binary_tree{
	int min;
	int max;
	boolean isBst;
	int height;

	
}
