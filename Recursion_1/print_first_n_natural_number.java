package Recursion_1;

public class print_first_n_natural_number {
    public static void print(int n){
		//Write your code here
		if(n==0){
			return;
		}
		print(n-1);
		System.out.print(n+" ");

}
    public static void printn(int n){
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println(n);
            return;
        }
        print(n--);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int num = 3;
        printn(num);
    }
}
