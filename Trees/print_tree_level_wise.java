package Trees;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class print_tree_level_wise {
    public static void printLevelWise(tree_node<Integer> root){
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		 while(root==null){
			 return;
		 }
		 Queue<tree_node<Integer>> q = new LinkedList<tree_node<Integer>>();
		 q.add(root);
		 q.add(null);

		 while(!q.isEmpty()){
			 tree_node<Integer> curr = q.poll();
			 if(curr!=null){
				 System.out.print(curr.data+" ");
				 for(int i=0; i<curr.children.size(); i++){
					 q.add(curr.children.get(i));
				 }
			 }else if(!q.isEmpty()){
				 q.add(null);
				 System.out.println();
			 }
		 }

	}
}
