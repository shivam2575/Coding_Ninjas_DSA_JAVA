package Linked_list_1;

import java.util.ArrayList;

public class remove_consecutive {
    public static ArrayList<Integer> remove_duplicate(int[] arr, int si){
        if(si==arr.length-1){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(arr[si]);
            return ans;
        }
        ArrayList<Integer> ans = remove_duplicate(arr, si+1);
        if(ans.get(0)==arr[si]){
            return ans;
        }
        ans.add(arr[si]);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,555,555,555};
        ArrayList<Integer> arr1 = remove_duplicate(arr, 0);
        for (Integer i : arr1) {
            System.out.println(i);
        }
    }
}
