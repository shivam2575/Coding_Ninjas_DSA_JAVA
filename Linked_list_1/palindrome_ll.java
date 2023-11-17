package Linked_list_1;

public class palindrome_ll {
    public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
		if(head==null || head.next==null){
			return true;
		}
		Node<Integer> slow = head;
		Node<Integer> fast = head.next;
		while(fast.next!=null && fast.next.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		Node<Integer> new_head = slow.next;
		slow.next = null;
		new_head = reverse(new_head);

		while(head!=null){
			if(head.data!=new_head.data){
				return false;
			}
			head = head.next;
			new_head = new_head.next;
		}

		return true;
		

	}

	public static Node<Integer> reverse(Node<Integer> head){
		if(head==null || head.next==null){
			return head;
		}
		Node<Integer> new_head = reverse(head.next);
		head.next.next = head;
		head.next = null;

		return new_head;
	}
}
