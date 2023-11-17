package Linked_list_2;

public class merge_sort_ll {
    public static Node<Integer> mergeSort(Node<Integer> head) {
		//Your code goes here
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node<Integer> head1 = mergeSort(slow.next);
        slow.next=null;
        Node<Integer> head2 = mergeSort(head);
        return merge(head1,head2);
	}

    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }

        Node<Integer> head = null;
        Node<Integer> tail = null;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                if(head==null){
                    head=head1;
                    tail=head1;
                }else{
                    tail.next=head1;
                    tail=head1;
                }
                head1=head1.next;
            }
            else{
                if(head==null){
                    head=head2;
                    tail=head2;
                }else{
                    tail.next = head2;
                    tail=head2;
                }
                head2=head2.next;
            }
        }
        if(head1!=null){
            tail.next=head1;
        }
        else if(head2!=null){
            tail.next = head2;
        }

        return head;
    }

}
