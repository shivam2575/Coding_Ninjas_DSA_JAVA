package Trees;

public class tree_use {

    public static void print(tree_node<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+": ");
        for(int i=0;i<root.children.size(); i++){
            System.out.print(root.children.get(i).data+" ");
        }
        System.out.println();
        for(int i=0;i<root.children.size(); i++){
            tree_node<Integer> child = root.children.get(i);
            print(child);
        }
    }
    public static void main(String[] args) {
        tree_node<Integer> root = new tree_node<Integer>(1);
        tree_node<Integer> node1 = new tree_node<Integer>(2);
        tree_node<Integer> node2 = new tree_node<Integer>(3);
        tree_node<Integer> node3 = new tree_node<Integer>(4);
        tree_node<Integer> node4 = new tree_node<Integer>(5);
        tree_node<Integer> node5 = new tree_node<Integer>(6);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);

        node2.children.add(node4);
        node2.children.add(node5);

        // print(root);
        System.out.println(number_of_nodes.number(root));


    }
}
