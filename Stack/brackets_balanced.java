package Stack;

import java.util.Stack;

public class brackets_balanced {
    public static boolean isBalanced(String expression) {
        //Your code goes here
        if(expression.length()%2!=0){
            return false;
        }
        Stack<Character> st = new Stack<>(); 
        char[] arr = expression.toCharArray();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]=='('){
                st.push(')');
            }
            else if(st.isEmpty()){
                  return false;
            }
            else{
                st.pop();
            }
        }

        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}
