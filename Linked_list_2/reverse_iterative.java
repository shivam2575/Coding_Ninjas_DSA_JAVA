package Linked_list_2;

public class reverse_iterative {
    public static Node<Integer> reverse_I(Node<Integer> head){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> curr = head;
        Node<Integer> prev = null;
        Node<Integer> next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
	}
}
