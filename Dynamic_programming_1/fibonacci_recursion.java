package Dynamic_programming_1;

import java.util.Scanner;

public class fibonacci_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=0; i<arr.length; i++){
            arr[i]=-1;
        }
        System.out.println(fib(n, arr));
    }

    private static int fib(int n, int[] arr) {
        if(n==0 || n==1){
            return n;
        }
        int ans1, ans2;
        if(arr[n-1]==-1){
            ans1 = fib(n-1, arr);
            arr[n-1]=ans1;
        }else{
            ans1 = arr[n-1];
        }
        if(arr[n-2]==-1){
            ans2 = fib(n-2, arr);
            arr[n-2]=ans2;
        }else{
            ans2 = arr[n-2];
        }
        int ans = ans1+ans2;
        return ans;
    }
}
