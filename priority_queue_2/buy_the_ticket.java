package priority_queue_2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class buy_the_ticket {
    public static int buyTicket(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		Queue<Integer> q = new LinkedList<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i : input) {
			pq.add(i);
			q.add(i);
		}

		int count = 0;
		while(!pq.isEmpty()){
			if(q.peek().equals(pq.peek())){
				if(k==0){
					return count+1;
				}else{
					count++;
					pq.poll();
					q.poll();
					k--;
				}
			}else{
				q.add(q.peek());
				q.poll();
				if(k==0){
					k = q.size()-1;
				}else{
					k--;
				}
			}
		}
		

		return count;

	}
}
