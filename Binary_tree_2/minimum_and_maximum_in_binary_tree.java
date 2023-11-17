package Binary_tree_2;

import Binary_Tree_1.binary_tree_node;

public class minimum_and_maximum_in_binary_tree {
    public static Pair<Integer, Integer> getMinAndMax(binary_tree_node<Integer> root) {
		//Your code goes here
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		if(root==null){
			return new Pair(min, max);
		}
		Pair<Integer, Integer> left = getMinAndMax(root.left);
		Pair<Integer, Integer> right = getMinAndMax(root.right);
		min = Math.min(root.data, Math.min(left.minimum, right.minimum));
		max = Math.max(root.data, Math.max(left.maximum, right.maximum));

		return new Pair(min,max);
	}
}
