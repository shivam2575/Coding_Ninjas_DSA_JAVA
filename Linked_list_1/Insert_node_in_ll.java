package Linked_list_1;

public class Insert_node_in_ll {
    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		//Your code goes here
		if(pos==0){
			Node<Integer> new_node = new Node<>(data);
			new_node.next = head;
			return new_node;
		}
		Node<Integer> temp = head;
		Node<Integer> new_node = new Node<>(data);
		int curr_index=0;
		while(temp!=null && curr_index<pos-1){
			temp = temp.next;
			curr_index++;
		}
		if(curr_index==pos-1){
			new_node.next = temp.next;
			temp.next = new_node;
		}
	
		return head;

	}
}
