package Trees;

public class number_of_nodes {
    public static int number(tree_node<Integer> root){
        if(root==null){
            return 0;
        }
        int count = 0;
        for(int i=0; i<root.children.size(); i++){
            count += number(root.children.get(i)); 
        }
        return 1+count; 
    }
}
