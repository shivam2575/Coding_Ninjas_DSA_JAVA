package Trees;

public class number_of_nodes_greater_than_x {
    public static int numNodeGreater(tree_node<Integer> root,int x){

		// Write your code here		
		if(root==null){
			return 0;
		}
		int small_ans = 0;
		for(int i=0; i<root.children.size(); i++){
			small_ans += numNodeGreater(root.children.get(i), x); 
		}
		if(root.data>x){
			return 1+small_ans;
		}
		return small_ans;

	}
}
