package Test_3;

import java.util.ArrayList;

import Trees.tree_node;

public class remove_leaf_node_in_tree {
    public static tree_node<Integer> removeLeafNodes(tree_node<Integer> root) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(root==null || root.children.size()==0){
			return null;
		}
		// find all leaf nodes to be removed from root
		ArrayList<Integer> indexes = new ArrayList<>();
		for(int i=0; i<root.children.size(); i++){
			tree_node<Integer> temp = root.children.get(i);
			if(temp.children.size()==0){
				indexes.add(i);
			}
		}

		for(int i=indexes.size()-1; i>=0; i--){
			int j = indexes.get(i);
			root.children.remove(j);
		}


		//call recursion on every subtree
		for(int i=0; i<root.children.size(); i++){
			tree_node<Integer> temp = removeLeafNodes(root.children.get(i));
			if(temp==null){
				root.children.remove(temp);
			}
		}

		return root;
		
	}
}
