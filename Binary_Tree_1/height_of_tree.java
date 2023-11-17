package Binary_Tree_1;

public class height_of_tree {
    public static int height(binary_tree_node<Integer> root) {
		//Your code goes here
		if(root==null){
			return 0;
		}
		int left_height = height(root.left);
		int right_height = height(root.right);
		int actual_height = Math.max(left_height, right_height);
		return 1+actual_height;
	}
}
