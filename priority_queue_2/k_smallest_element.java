package priority_queue_2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class k_smallest_element {
    public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		// Write your code here
		ArrayList<Integer> ans = new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i : input) {
			pq.add(i);	
		}

		for(int i=0; i<k; i++){
			ans.add(pq.poll());
		}

		return ans;

	}
}
