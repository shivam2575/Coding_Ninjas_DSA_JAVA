package Linked_list_1;

public class Delete_node_in_ll {
    public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// Write your code here.
		if(head==null){
			return head;
		}
		if(pos==0){
			head = head.next;
		}else{
			Node<Integer> temp = head;
			int curr_index = 0; 
			while(curr_index<pos-1 && temp.next!=null){
				temp = temp.next;
				curr_index++;
			}

			if(temp!=null && temp.next!=null){
				Node<Integer> to_be_del = temp.next;
				temp.next = temp.next.next;	
				to_be_del.next = null;
			}

		}
		

		return head;

	}
}
