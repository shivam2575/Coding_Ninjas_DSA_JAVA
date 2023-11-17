package Binary_search_tree_1;

public class LCA_to_BST {
    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root==null){
			return -1;
		}
		int max = Math.max(a,b);
		int min = Math.min(a,b);
		if(root.data==max){
			return max;
		}
		else if(root.data==min){
			return min;
		}
		else if(root.data>min && root.data<max){
			return root.data;
		}
		else if(root.data>max){
			return getLCA(root.left, a, b);
		}
		else{
			return getLCA(root.right, a, b);
		}
		
	}
}
