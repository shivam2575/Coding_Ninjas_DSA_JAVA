package Linked_list_2;

public class delete_every_n_node {
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		//Your code goes here
        if(head == null){
            return head;
        }
        Node<Integer> n_head = null;
        Node<Integer> n_tail = null;
        int m_count=0, n_count=0;

        while(head!=null){
            if(m_count<M){
                if(n_head==null){
                    n_head = head;
                    n_tail = head;
                }
                else{
                    n_tail.next = head;
                    n_tail = n_tail.next; 
                }
                m_count++;
                head = head.next;
            }
            else if(n_count<N){
                head = head.next;
                n_count++;
            }
            else{
                m_count = 0;
                n_count = 0;
            }
        }

        if(n_head != null){
            n_tail.next = null;
            return n_head;
        }

        return head;

	}
}
