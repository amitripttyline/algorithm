//Search element in 2D array
package v1.Searching;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {2,7,8,12},
                {9,8,22,33},
                {10,16,28,44}
        };
        int target = 9;
        int[] arr2 = searchIn2Darray(arr, target);
        System.out.println(Arrays.toString(arr2));

    }

    static int[] searchIn2Darray(int arr[][], int target) {
        int r = 0;
        int c = arr.length;
        while(r < arr.length & c > 0){
            if(arr[r][c] == target){
                return new int[]{r, c};
            }

            if(arr[r][c] < target){
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
