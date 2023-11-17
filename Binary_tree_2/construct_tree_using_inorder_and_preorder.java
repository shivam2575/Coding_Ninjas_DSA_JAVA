package Binary_tree_2;

import Binary_Tree_1.binary_tree_node;

public class construct_tree_using_inorder_and_preorder {
    public static binary_tree_node<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
		if(preOrder.length==0 || inOrder.length==0){
			return null;
		}
		binary_tree_node<Integer> root = new binary_tree_node<Integer>(preOrder[0]);
		int io_ei=0;

		while(io_ei<inOrder.length){
			if(inOrder[io_ei]==root.data){
				break;
			}
			io_ei++;
		}
		int[] in_left = new int[io_ei];
		int[] in_right = new int[inOrder.length-in_left.length-1];

		for(int i=0; i<in_left.length; i++){
			in_left[i] = inOrder[i];
		}

		for(int i=0; i<in_right.length; i++){
			in_right[i] = inOrder[in_left.length+1+i];
		}

		int[] pre_left = new int[in_left.length];
		int[] pre_right = new int[in_right.length];

		for(int i=0; i<pre_left.length; i++){
			pre_left[i] = preOrder[i+1];
		}

		for(int i=0; i<pre_right.length; i++){
			pre_right[i] = preOrder[pre_left.length+1+i];
		}

		root.left = buildTree(pre_left, in_left);
		root.right = buildTree(pre_right, in_right);

		return root;
	}
}
