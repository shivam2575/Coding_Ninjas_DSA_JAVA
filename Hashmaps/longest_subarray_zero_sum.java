package Hashmaps;
/*
 * sum of longest subarray to 0 can be found using:
 * if the sum at one index of array is same as sum at another index then its sum would be zero
 */

import java.util.HashMap;

public class longest_subarray_zero_sum {
    public static int longest(int[] arr){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1]; 
        }
        int len = 0, j=0;
        for (int i : arr) {
            if(i==0){
                if(len<i+1){
                    len=i+1;
                }
            }
            else if(map.containsKey(i)){
                if(len<i-map.get(i)){
                    len = i-map.get(i);
                }
            }
            else{
                map.put(i, j);
            }
            j++;
        }
        return len;
    }
}
