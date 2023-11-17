package Trees;

public class structurally_identical {
    public static boolean checkIdentical(tree_node<Integer> root1, tree_node<Integer> root2){
		// Write your code here
		if(root1==null && root2==null){
			return true;
		}
		if(root1==null){
			return false;
		}
		if(root2==null){
			return false;
		}
		if(root1.data!=root2.data){
			return false;
		}
		//changes made by TA
		//before comparing the children, please check if the
		//no. of children are same.
		if(root1.children.size()!=root2.children.size())
			return false;
		for(int i=0; i<root1.children.size(); i++){
			if(!checkIdentical(root1.children.get(i),root2.children.get(i))){
				return false;
			}
		}

		return true;

	}
}
