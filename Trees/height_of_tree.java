package Trees;

public class height_of_tree {
    public static int getHeight(tree_node<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		 if(root==null){
			 return 0;
		 }
		 int small_ans = 0;
		 for(int i=0; i<root.children.size(); i++){
			 small_ans = Math.max(small_ans, getHeight(root.children.get(i)));
		 }
		 return 1+small_ans;
	}
}
