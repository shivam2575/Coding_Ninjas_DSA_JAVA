package Recursion_3;

import java.util.ArrayList;

public class return_subsequence {
    public static ArrayList<String> sub_sequence(String str){
        if(str.length()==0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        ArrayList<String> small_ans = sub_sequence(str.substring(1));
        for(int i=0; i<small_ans.size(); i++){
            small_ans.add(str.charAt(0)+small_ans.get(i));
        }
        return small_ans;
    }
}
