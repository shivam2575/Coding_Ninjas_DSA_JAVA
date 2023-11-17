package Trees;

public class sum_of_all_nodes {
    public static int sumOfAllNode(tree_node<Integer> root){
		if(root==null){
			return 0;
		}
		int sum = 0;
		for(int i=0;i<root.children.size();i++){
			sum+=sumOfAllNode(root.children.get(i));
		}
		return root.data+sum;
	
	}
}
