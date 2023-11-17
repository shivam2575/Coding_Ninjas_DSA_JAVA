package Linked_list_2;

public class reverse_ll {
    public static Node<Integer> reverseRec(Node<Integer> head) {
		//Your code goes here
        if(head==null || head.next==null){
            return head;
        }

        Node<Integer> new_head = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return new_head;
	}
}
