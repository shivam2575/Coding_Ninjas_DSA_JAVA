package Linked_list_1;

public class Linkedlist_use {
    public static Node<Integer> create_ll(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    public static void main(String[] args) {
        Node<Integer> head = create_ll();
        print(head);
        
    }
    private static void print(Node<Integer> head) {
        Node<Integer> temp = head; 
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
}
