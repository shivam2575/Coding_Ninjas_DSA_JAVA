package Binary_search_tree_1;

public class replace_with_sum_of_greater_nodes {
    public static int replace_helper(BinaryTreeNode<Integer> root, int sum){
        if(root==null){
            return sum; 
        }
        sum = replace_helper(root.right, sum);
        sum+=root.data;
        root.data = sum;
        sum = replace_helper(root.left, sum);

        return sum;
    }

   public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
       // Write your code here
       if(root==null){
           return;
       }
       replace_helper(root, 0);
   }
}
