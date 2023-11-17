package Trees;

public class check_if_tree_contain_element_x {
    public static boolean checkIfContainsX(tree_node<Integer> root, int x){
		// Write your code here
		if(root==null){
			return false;
		}
		if(root.data==x){
			return true;
		}
		for(int i=0; i<root.children.size(); i++){
			if(checkIfContainsX(root.children.get(i),x)){
				return true;
			}
		}

		return false;

	}
}
