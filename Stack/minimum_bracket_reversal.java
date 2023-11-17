package Stack;

import java.util.Stack;

public class minimum_bracket_reversal {
    public static int countBracketReversals(String input) {
		//Your code goes here
		int len = input.length();
		if(len%2!=0){
			return -1;
		}
		int count = 0;
		Stack<Character> st = new Stack<>();
		char[] arr = input.toCharArray();
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='{'){
				st.push('{');
			}else if(st.isEmpty() && arr[i]=='}'){
				count++;
				st.push('{');
			}else{
				st.pop();
			}
		}
		return (st.size()/2)+count;
	}
}
