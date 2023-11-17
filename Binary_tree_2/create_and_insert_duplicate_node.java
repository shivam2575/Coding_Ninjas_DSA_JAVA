package Binary_tree_2;

import Binary_Tree_1.binary_tree_node;

public class create_and_insert_duplicate_node {
    public static void insertDuplicateNode(binary_tree_node<Integer> root) {
		//Your code goes here
		while(root==null){
			return;
		}

		binary_tree_node<Integer> dup = new binary_tree_node<Integer>(root.data);
		dup.left = root.left;
		root.left = dup;

		insertDuplicateNode(dup.left);
		insertDuplicateNode(root.right);


	}
}
