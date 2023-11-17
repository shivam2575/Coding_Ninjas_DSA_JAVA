package Trees;

public class next_larger_element {
    public static tree_node<Integer> findNextLargerNode(tree_node<Integer> root, int n){
		// Write your code here
		if(root==null){
			return null;
		}
		tree_node<Integer> ans = null;
		if(root.data>n){
			ans = root;
		}
		for(int i=0; i<root.children.size(); i++){
			tree_node<Integer> curr_ans = findNextLargerNode(root.children.get(i),n);
			if(curr_ans!=null){
				if(ans==null || curr_ans.data<ans.data){
					ans = curr_ans;
				}
			}
		}

		return ans;
	}
}
