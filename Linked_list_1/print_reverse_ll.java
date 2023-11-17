package Linked_list_1;

public class print_reverse_ll {
    public static void printReverse(Node<Integer> root) {
		//Your code goes here
		if(root==null){
			return;
		}
		printReverse(root.next);
		System.out.print(root.data+" ");

	}
}
