package Queue;

import Linked_list_1.Node;

public class queue_ll<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public int size(){
        return size;
    }

    public boolean is_empty(){
        return size==0;
    }

    public T front() throws queueEmptyException{
        if(size==0){
            throw new queueEmptyException();
        }
        return front.data;
    }

    public void enqueue(T ele){
        Node<T> new_node = new Node<>(ele);
        if(size==0){
            front = new_node;
            rear = new_node;
        }
        rear.next = new_node;
        rear = rear.next;
        size++;
    }

    public T dequeue() throws queueEmptyException{
        if(size==0){
            throw new queueEmptyException();
        }
        T data = front.data;
        front = front.next;
        size--;
        if(size==0){
            rear=null;
        }
        return data;
    }
}
