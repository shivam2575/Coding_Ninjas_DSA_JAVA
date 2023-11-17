package Stack;

import java.util.Stack;

public class check_redundant_brackets {
    public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		int n = expression.length();
		if(n<=4){
			return true;
		}

 		Stack<Character> st = new Stack<>();
		for(int i=0; i<n; i++){
			if(expression.charAt(i)!=')'){
				st.push(expression.charAt(i));
			}else{
				int count = 0;
				while(st.pop()!='(' && !st.isEmpty()){
					count++;
				}
				if(count<1){
					return true;
				}
			}
		}

		return false;

	}
}
