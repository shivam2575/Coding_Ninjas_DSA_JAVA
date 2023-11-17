package Binary_search_trees_2;

import java.util.ArrayList;

import Binary_Tree_1.binary_tree_node;

public class Find_path_in_bst {
    public static ArrayList<Integer> getPath(binary_tree_node<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		if(root==null){
			return null;
		}
		ArrayList<Integer> ans = new ArrayList<>();
		if(root.data==data){
			ans.add(root.data);
			return ans;
		}
		else if(root.data<data){
			ans = getPath(root.right, data);
		}
		else{
			ans = getPath(root.left, data);
		}
		if(ans!=null){
			ans.add(root.data);
		}
		return ans;
	}
}
