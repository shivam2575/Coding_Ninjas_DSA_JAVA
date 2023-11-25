package Recursion_3;

public class print_subsequence {
    public static String[] print_ss(String str){
        if(str.length()==0){
            String[] ans = {""};
            return ans;
        }
        String[] small_ans = print_ss(str.substring(1));
        String[] ans = new String[small_ans.length*2];
        for(int i=0; i<ans.length; i++){
            ans[i] = str.charAt(0)+small_ans[i];
        } 
        for(int i=small_ans.length; i<ans.length; i++){
            ans[i] = small_ans[i-small_ans.length];
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] ss = print_ss("abc");
        for (String string : ss) {
            System.out.println(string);
        }
    }
}
