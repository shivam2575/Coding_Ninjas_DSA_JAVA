package Strings;

public class compress_the_string {
    public static String getCompressedString(String str) {
		// Write your code here.
		int n = str.length(), count=1, i=0;
		String ans="";

		for(int j=1; j<n; j++){
			if(str.charAt(i)==str.charAt(j)){
				count++;
			}else{
				if(count>1){
					ans=ans+str.charAt(i)+count;
				}else{
					ans=ans+str.charAt(i);
				}
				count=1;
				i=j;
			}
		}

		if(count>1){
			ans = ans+str.charAt(i)+count;
		}else{
			ans=ans+str.charAt(i);
		}

		return ans;
	}
}
