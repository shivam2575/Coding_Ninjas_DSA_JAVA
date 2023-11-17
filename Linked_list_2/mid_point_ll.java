package Linked_list_2;

public class mid_point_ll {
    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
