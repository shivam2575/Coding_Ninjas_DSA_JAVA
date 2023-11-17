package Linked_list_1;

public class Print_ith_node {
    public static void printIthNode(Node<Integer> head, int i){
		if(head==null){
			return;
		}
		int index=0;
		Node<Integer> temp = head;
		while(index!=i && temp!=null){
			temp=temp.next;
			index++;
		}
		if(temp!=null){
			System.out.print(temp.data);
		}
		
        
    }
}
