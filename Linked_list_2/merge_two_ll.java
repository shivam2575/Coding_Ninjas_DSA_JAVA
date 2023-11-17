package Linked_list_2;

public class merge_two_ll {
    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        Node<Integer> head = null;
        Node<Integer> tail = null;
        Node<Integer> i = head1;
        Node<Integer> j = head2;

        while(i!=null && j!=null){
            if(i.data<=j.data){
                if(head==null){
                    head = i;
                    tail = i;
                }else{
                    tail.next=i;
                    tail=i;
                }
                i=i.next;
            }else{
                if(head==null){
                    head=j;
                    tail=j;
                }else{
                    tail.next = j;
                    tail = j;
                }
                j=j.next;
            }
        }

        if(i!=null){
            tail.next=i;
        }

        else if(j!=null){
            tail.next=j;
        }

        return head;
    }
}
