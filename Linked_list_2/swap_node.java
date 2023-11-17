package Linked_list_2;

public class swap_node {
    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
		//Your code goes here
        if(head==null){
            return head;
        }
        if(head.next==null && i!=j){
            return null;
        }
        if(head.next==null && i==0 && j==0){
            return head;
        }
        Node<Integer> curr1 = head;
        Node<Integer> curr2 = head;
        Node<Integer> prev1 = null;
        Node<Integer> prev2 = null;

        int i_count = 0, j_count = 0;

        while(i_count<i && curr1!=null){
            prev1 = curr1;
            curr1 = curr1.next;
            i_count++;
        }

        while(j_count<j && curr2!=null){
            prev2=curr2;
            curr2 = curr2.next;
            j_count++;
        }
        if(curr1==null || curr2==null){
            return null;
        }

        if(i==0){
            if(j==1){
                curr1.next = curr2.next;
                curr2.next=curr1;
            }else{
                Node<Integer> curr1_fwd = curr1.next;
                curr1.next = curr2.next;
                curr2.next = curr1_fwd;
                prev2.next = curr1;
            }
            return curr2;
        }
        if(j==0){
            if(i==1){
                curr2.next = curr1.next;
                curr1.next=curr2;
            }
            else{
                Node<Integer> curr2_fwd = curr2.next;
                curr2.next = curr1.next;
                curr1.next = curr2_fwd;
                prev1.next = curr2;
            }
            return curr1;
        }
        if(Math.abs(i-j)==1){
            if(i<j){
                curr1.next = curr2.next;
                curr2.next = curr1;
                prev1.next = curr2;
            }else{
                curr2.next = curr1.next;
                curr1.next = curr2;
                prev2.next = curr1;
            }
        }else if(i>j){
            prev2.next = curr1;
            Node<Integer> curr1_fwd = curr1.next;
            curr1.next = prev1;
            prev1.next = curr2;
            curr2.next = curr1_fwd;
        }else{
            prev1.next = curr2;
            Node<Integer> curr2_fwd = curr2.next;
            curr2.next = prev2;
            prev2.next = curr1;
            curr1.next = curr2_fwd;
        }

        return head;
	}
    
}
