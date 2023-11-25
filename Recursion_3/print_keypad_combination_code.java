package Recursion_3;

public class print_keypad_combination_code {
    public static void printKeypad(int input){
		// Write your code here
		String keypads[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		print_helper(input,"",keypads);
	}

	public static void print_helper(int input,String str,String[] keys){
		// Write your code here
		if(input==0){
			System.out.println(str);
			return;
		}
		int rem = input%10;
		int small_input = input/10;
		for(int i=0;i<keys[rem].length(); i++){
			String temp = keys[rem].charAt(i)+str;
			print_helper(small_input,temp,keys);
		}	
	}
}
