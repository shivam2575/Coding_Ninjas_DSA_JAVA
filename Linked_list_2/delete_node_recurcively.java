package Linked_list_2;

public class delete_node_recurcively {
    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
    	//Your code goes here
        if(head==null){
            return head;
        }
        if(pos==0){
            return head.next;
        }
        head.next = deleteNodeRec(head.next, pos-1);
        return head;
	}
}
