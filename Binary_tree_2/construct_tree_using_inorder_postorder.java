package Binary_tree_2;

import Binary_Tree_1.binary_tree_node;

public class construct_tree_using_inorder_postorder {
    public static binary_tree_node<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
		if(postOrder.length==0 || inOrder.length==0){
			return null;
		}
		int p_len = postOrder.length;
		int i_len = inOrder.length;
		binary_tree_node<Integer> root = new binary_tree_node<Integer>(postOrder[p_len-1]);

		int r_index = 0;
		while(r_index<i_len){
			if(inOrder[r_index]==root.data){
				break;
			}
			r_index++;
		}
		int[] in_left = new int[r_index];
		int[] in_right = new int[i_len-in_left.length-1];

		for(int i=0; i<in_left.length; i++){
			in_left[i] = inOrder[i];
		}

		for(int i=0; i<in_right.length; i++){
			in_right[i] = inOrder[in_left.length+1+i];
		}

		int[] po_left = new int[in_left.length];
		int[] po_right = new int[in_right.length];

		for(int i=0; i<po_left.length; i++){
			po_left[i] = postOrder[i];
		}

		for(int i=0; i<po_right.length; i++){
			po_right[i] = postOrder[po_left.length+i];
		}

		root.left = buildTree(po_left, in_left);
		root.right = buildTree(po_right, in_right);

		return root;
	}
}
