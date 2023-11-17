package Recursion_assignment;

public class check_palindrome {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        if(str.length()<=1){
            return true;
        }

        boolean ans = isPalindrome(str.substring(1,str.length()-1));
        if(ans){
            if(str.charAt(0)==str.charAt(str.length()-1)){
                return true;
            }else{
                return false;
            } 
        }
        return ans;
    }
}
