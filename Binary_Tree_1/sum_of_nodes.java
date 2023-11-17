package Binary_Tree_1;

public class sum_of_nodes {
    public static int getSum(binary_tree_node<Integer> root) {
		//Your code goes here.
		if(root==null){
			return 0;
		}
		int left_sum = getSum(root.left);
		int right_sum = getSum(root.right);

		return root.data+left_sum+right_sum;
	}
}
