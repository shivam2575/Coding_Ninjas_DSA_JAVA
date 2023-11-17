package Priority_queue;

public class PQ_use {
    public static void main(String[] args) throws empty_queue_exception {
        priority_queue<String> pq = new priority_queue<>();

        pq.insert("a", 11);
        pq.insert("b", 2);
        pq.insert("c", 3);
        pq.insert("d", 1);

        while(!pq.is_empty()){
            System.out.println(pq.get_min());
            pq.remove();
        }

    }
}
