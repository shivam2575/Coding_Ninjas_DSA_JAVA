package Test_1;

public class does_string_s_contains_t {
    public static boolean checkSequence(String s, String t) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		 int j=0,i=0;
		 int n = s.length(), m=t.length();
		 while(j<n && i<m){
			 char x = t.charAt(i);
			 if(s.charAt(j)==x){
				 i++;
			 }
			 j++;
		 }

		 return i==m;

	}
}
