package Binary_search_tree_1;

public class bst_to_ll {
    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		if(root==null){
			return null;
		}
		if(root.left==null && root.right==null){
			return new LinkedListNode<Integer>(root.data);
		}
		LinkedListNode<Integer> curr = new LinkedListNode<>(root.data);
		LinkedListNode<Integer> head = constructLinkedList(root.left);
		LinkedListNode<Integer> next = constructLinkedList(root.right);

		if(head==null){
			head=curr;
		}

		LinkedListNode<Integer> temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next=curr;
		curr.next=next;
		return head;
		

	}
}
