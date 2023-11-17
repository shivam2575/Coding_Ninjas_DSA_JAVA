package Two_D_Arrays;

public class print_spiral {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(arr, 4, 4);
    }
    public static void printSpiral(int[][]a, int n, int m){
        int total = n*m, count=0;
        int upperRow = 0, upperCol = 0;
        int lowerRow = n-1, lowerCol = m-1;

        while(count<total){
            //uc to lc
            for(int i=upperCol; count<total && i<=lowerCol; i++){
                System.out.println(a[upperRow][i]);
                count++;
            }
            upperRow++;

            //ur to lr
            for(int i=upperRow; count<total && i<=lowerRow; i++){
                System.out.println(a[i][lowerCol]);
                count++;
            }
            lowerCol--;

            //lc to uc
            for(int i=lowerCol; count<total && i>=upperCol; i--){
                System.out.println(a[lowerRow][i]);
                count++;
            }
            lowerRow--;

            //lr to ur
            for(int i=lowerRow; count<total && i>=upperRow; i--){
                System.out.println(a[i][upperCol]);
                count++;
            }
            upperCol++;

        }
    }
}
