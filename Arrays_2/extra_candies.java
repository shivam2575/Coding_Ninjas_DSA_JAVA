package Arrays_2;

public class extra_candies {
    public static int[] extraCandies(int n, int x, int []p1, int []p2) {
        // Write your code here.
        int[] ans = new int[n];
        int total=0,carry = 0;
        int i = 0;
        while(i<n){
            total = p1[i]+p2[i]+carry;
            if(total<=x){
                ans[i]=total;
                carry = 0;
            }else{
                ans[i]=x;
                carry = total-x;
            }
            i++;
        }

        return ans;
    }
}
