package Binary_Tree_1;

public class nodes_greater_than_x {
    public static int countNodesGreaterThanX(binary_tree_node<Integer> root, int x) {
		//Your code goes here
		if(root==null){
			return 0;
		}
		int left_ans = countNodesGreaterThanX(root.left, x);
		int right_ans = countNodesGreaterThanX(root.right, x);
		if(root.data>x){
			return 1+left_ans+right_ans;
		}
		return left_ans+right_ans;
	}
}
