package priority_queue_2;

import java.util.PriorityQueue;

public class k_largest_element_2 {
    public static int kthLargest(int n, int[] input, int k) {
		// Write your code here
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i : input) {
			pq.add(i);
		}

		for(int i=0; i<n-k; i++){
			pq.poll();
		}

		return pq.poll();

	}
}
