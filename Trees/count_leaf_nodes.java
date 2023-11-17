package Trees;

public class count_leaf_nodes {
    public static int countLeafNodes(tree_node<Integer> root){
		// Write your code here
		if(root==null){
			return 0;
		}
		if(root.children.size()==0){
			return 1;
		}
		int ans = 0;
		for(int i=0; i<root.children.size(); i++){
			ans += countLeafNodes(root.children.get(i));
		}
		return ans;
	}
}
