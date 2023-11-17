package Trees;

public class replace_node_with_depth {
    public static void replaceWithDepthValueHelper(tree_node<Integer> root, int depth){
		// Write your code here
		if(root==null){
			return;
		}
		root.data = depth;
		for(int i=0; i<root.children.size(); i++){
			replaceWithDepthValueHelper(root.children.get(i), depth+1);
		}
		
	}
	
	public static void replaceWithDepthValue(tree_node<Integer> root){
		// Write your code here
		if(root==null){
			return;
		}
		replaceWithDepthValueHelper(root,0);
		
	}
}
