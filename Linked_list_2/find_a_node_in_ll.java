package Linked_list_2;

public class find_a_node_in_ll {
    public static int findNodeRec(Node<Integer> head, int n) {
    	//Your code goes here
        if(head==null){
            return -1;
        }
        if(head.data.equals(n)){
            return 0;
        }
        int smallAns = findNodeRec(head.next, n);

        if(smallAns==-1){
            return smallAns;
        }
        return smallAns+1;

	}
}
