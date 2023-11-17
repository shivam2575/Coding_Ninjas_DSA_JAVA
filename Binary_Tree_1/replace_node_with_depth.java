package Binary_Tree_1;

public class replace_node_with_depth {
    public static void changeToDepthTree(binary_tree_node<Integer> root) {
	    //Your code goes here
		changeToDepthTree1(root,0);
	}

	public static void changeToDepthTree1(binary_tree_node<Integer> root, int depth) {
	    //Your code goes here
		if(root==null){
			return;
		}
		root.data=depth;
		changeToDepthTree1(root.left,depth+1);
		changeToDepthTree1(root.right,depth+1);
	}
}
