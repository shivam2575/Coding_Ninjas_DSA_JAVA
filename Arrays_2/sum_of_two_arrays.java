package Arrays_2;

public class sum_of_two_arrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int n = arr1.length-1;
        int m = arr2.length-1;
        int k = output.length-1;
        int total = 0, carry=0, rem=0;

        while(n>=0 && m>=0){
            total = arr1[n]+arr2[m]+carry;
            rem = total%10;
            carry = total/10;
            output[k] = rem;
            n--;
            m--;
            k--;
        }

        while(n>=0){
            total = arr1[n]+carry;
            rem = total%10;
            carry = total/10;
            output[k] = rem;
            n--;
            k--;
        }

        while(m>=0){
            total = arr2[m]+carry;
            rem = total%10;
            carry = total/10;
            output[k] = rem;
            m--;
            k--;
        }

        output[k]=carry;
    }
}
