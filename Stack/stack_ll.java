package Stack;

import java.util.Stack;

import Linked_list_1.Node;

public class stack_ll<T> {

    private Node<T> head;
    private int size;

    public int size(){
        return size;
    }

    public boolean is_empty(){
        return size==0;
    }

    public void push(T ele){
        Node<T> new_ele = new Node<T>(ele);
        new_ele.next = head;
        head = new_ele;
        size++;
    }

    public T pop() throws stack_empty_exception{
        if(head==null){
            throw new stack_empty_exception();
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

    public T top() throws stack_empty_exception{
        if(head == null){
            throw new stack_empty_exception();
        }
        return head.data;
        Stack<Integer> a = new Stack<>();
    }
}
