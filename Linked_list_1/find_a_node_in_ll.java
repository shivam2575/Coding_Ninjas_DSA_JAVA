package Linked_list_1;

public class find_a_node_in_ll {
    public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		Node<Integer> temp = head;
		int index = 0;
		while(temp!=null){
			if(temp.data==n){
				return index;
			}
			temp=temp.next;
			index++;
		}
		return -1;
	}
}
