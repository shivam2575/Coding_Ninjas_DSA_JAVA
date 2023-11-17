package Linked_list_1;

public class eliminate_duplicates {
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
		if(head==null){
			return head;
		}
		Node<Integer> i = head;

		while(i.next!=null){
			if(!i.data.equals(i.next.data)){
				i = i.next;
			}else{
				i.next = i.next.next;
			}
		}
		return head;
	}
}
