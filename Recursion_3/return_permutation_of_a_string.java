package Recursion_3;

public class return_permutation_of_a_string {
    public static String[] permutationOfString(String input){
		// Write your code here
		if(input.length()==0){
			String[] arr = {""};
			return arr;
		}
		String[] output = new String[fact(input.length())];
		for(int i=0,k=0; i<input.length(); i++){
			char to_add = input.charAt(i);
			String to_pass = input.substring(0, i)+input.substring(i+1);
			String[] small_out = permutationOfString(to_pass);
			for(int j=0; j<small_out.length; j++){
				output[k++] = to_add+small_out[j];
			}
		}
		return output;
	}

	public static int fact(int si){
		int i=1,ans=1;
		while(i<=si){
			ans*=i;
			i++;
		}
		return ans;	
	}
}
