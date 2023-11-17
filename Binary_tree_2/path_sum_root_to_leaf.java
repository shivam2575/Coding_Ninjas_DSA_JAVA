package Binary_tree_2;

import Binary_Tree_1.binary_tree_node;

public class path_sum_root_to_leaf {
    public static void rootToLeafPathsSumToK(binary_tree_node<Integer> root, int k) {
		//Your code goes here
		if(root==null){
			return;
		}
		print(root, k, "");

	}

	public static void print(binary_tree_node<Integer> root, int k, String str){
		if(root==null){
			return;
		}
		if(root.data==k){
			if(root.left==null && root.right==null){
				System.out.println(str+root.data);
			}
			return;
		}
		str = str+root.data+" ";
		print(root.left, k-root.data, str);
		print(root.right, k-root.data, str);
	}
}
