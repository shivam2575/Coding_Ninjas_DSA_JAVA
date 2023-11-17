package Queue;

public class queue_use {
    public static void main(String[] args) throws queueEmptyException {
        queue_ll<Integer> q = new queue_ll<>();
        System.out.println(q.is_empty());
        System.out.println(q.size());
        q.enqueue(1);
        q.enqueue(10);
        q.enqueue(100);
        q.enqueue(1000);
        q.enqueue(10000);
        System.out.println(q.front());
        System.out.println(q.size());
        System.out.println(q.is_empty());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println(q.size());
        System.out.println(q.is_empty());
        q.enqueue(1);
        q.enqueue(10);
        q.enqueue(100);
        q.enqueue(1000);
        q.enqueue(10000);
        System.out.println(q.front());

        
 
    }
}
