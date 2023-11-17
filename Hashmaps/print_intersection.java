package Hashmaps;

import java.util.HashMap;

public class print_intersection {
    public static void printIntersection(int[] arr1,int[] arr2){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		if(arr1.length==0 || arr2.length==0){
			return;
		}

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : arr1) {
			if(map.containsKey(i)){
				map.put(i,map.get(i)+1);
			}else{
				map.put(i,1);
			}
			
		}
		for (int i : arr2) {
			if(map.containsKey(i) && map.get(i)>0){
				System.out.println(i);
				map.put(i,map.get(i)-1);
			}
		}

	}
}
