package Hashmaps;

import java.util.HashMap;

public class maximum_frequency_number {
    public static int maxFrequencyNumber(int[] arr){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++){
			if(map.containsKey(arr[i])){
				int count = map.get(arr[i])+1;
				map.put(arr[i], count); 
			}
			else{
				map.put(arr[i], 1);
			}
		}
		int max=0;
		int ans=0;
		for (Integer i : arr) {
			if(max<map.get(i)){
				max=map.get(i);
				ans=i;
			}
		}
		return ans;
    }
}
