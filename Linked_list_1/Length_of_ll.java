package Linked_list_1;

public class Length_of_ll {
    public static int length(Node head){
        //Your code goes here
        Node temp = head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
}
