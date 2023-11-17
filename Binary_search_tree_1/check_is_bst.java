package Binary_search_tree_1;

public class check_is_bst {
    public static boolean isBST(BinaryTreeNode<Integer> root, int min, int max) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		if(root==null){
			return true;
		}
		
		if(root.data<=min || root.data>max){
			return false;
		}
		boolean left_ans = isBST(root.left, min, root.data-1);
		boolean right_ans = isBST(root.right, root.data, max);
		return left_ans&&right_ans;
	}

	public static boolean isBST(BinaryTreeNode<Integer> root) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		if(root==null){
			return true;
		}
		
		return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
}
