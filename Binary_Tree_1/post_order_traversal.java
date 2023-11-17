package Binary_Tree_1;

public class post_order_traversal {
    public static void postOrder(binary_tree_node<Integer> root) {
		//Your code goes here
		if(root==null){
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
}
