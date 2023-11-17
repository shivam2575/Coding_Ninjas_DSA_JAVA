package Two_D_Arrays;

public class print_row_wise {
    public static int[] printRowWise(int [][]a) {
        // Write your code here.
        int n = a.length;
        int m = a[0].length;
        int[] ans = new int[n*m];
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++,count++){
                ans[count] = a[i][j];
            }
        }

        return ans;
    }
}

/*
 * 1 - take length of 2d-array for number of rows (n) 
 * 2 - take length of array[0] for number of columns (m)
 * 3 - make an array of size n*m for returning the result
 * 4 - make a count variable for the result array starting from 0.
 * 5 - there will be two nested loops 1st for number of rows which will iterate over each row from 0 to n
 * 6 - the inside loop will iterate over each element in the ith row from 0 to m
 * 7 - store the element in the result array like: ans[count] = a[i][j];
 * 8 - dont forget to increment count after storing an element
 * 9 - finally return the ans array
 */
