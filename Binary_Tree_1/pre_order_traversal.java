package Binary_Tree_1;

public class pre_order_traversal {
    public static void preOrder(binary_tree_node<Integer> root) {
		//Your code goes here
		if(root == null){
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
}
