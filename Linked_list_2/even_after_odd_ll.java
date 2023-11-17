package Linked_list_2;

public class even_after_odd_ll {
    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		//Your code goes here
        if(head==null || head.next==null){
            return head;
        }

        Node<Integer> o_head = null;
        Node<Integer> o_tail = null;
        Node<Integer> e_head = null;
        Node<Integer> e_tail = null;
        int i = 1;
        while(head!=null){
            if(head.data%2==0){
                if(e_head==null){
                    e_head = head;
                    e_tail = head;
                }
                else{
                    e_tail.next = head;
                    e_tail = e_tail.next; 
                }
            }
            else{
                if(o_head==null){
                    o_head = head;
                    o_tail = head;
                }
                else{
                    o_tail.next = head;
                    o_tail = o_tail.next;
                }
            }
            head = head.next;
        }
        

        if(o_head == null){
            e_tail.next = null;
            return e_head;
        }
        o_tail.next = e_head;
        if(e_tail!=null){
            e_tail.next = null;
        }
        return o_head;
	}
}
