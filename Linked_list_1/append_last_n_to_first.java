package Linked_list_1;

public class append_last_n_to_first {
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
		if(head==null || n==0){
			return head;
		}
		Node<Integer> temp = head;
		int len=1;
		while(temp.next!=null){
			temp=temp.next;
			len++;
		}

		temp.next = head;

		temp = head;
		int index = 0;
		while(index<len-n-1){
			temp=temp.next;
			index++;
		}
		head = temp.next;
		temp.next = null;

		return head;
	}
}
