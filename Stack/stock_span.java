package Stack;

import java.util.Stack;

public class stock_span {
    public static int[] stockSpan(int[] price) {
		//Your code goes here
		int[] arr = new int[price.length];
		Stack<Integer> index = new Stack<>();
		index.push(0);
		arr[0]=1;
		for(int i=1; i<price.length; i++){
			while(!index.isEmpty() && price[index.peek()]<price[i]){
				index.pop();
			}
			if(index.isEmpty()){
				arr[i] = i+1;
			}
			else{
				arr[i] = i-index.peek();
			}
			index.push(i);
			
		}
		return arr;
	}
}
