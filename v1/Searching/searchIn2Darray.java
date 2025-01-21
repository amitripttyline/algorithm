import java.util.Arrays;

public class searchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,4,5},
                {4,5,55,33},
                {11,44}
        };
        int target = 55;
        int[] index = findin2darray(arr, target);// format of return value {row, column}
        System.out.println(Arrays.toString(index));
    }
    static int[] findin2darray(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for(int column=0; column < arr[row].length; column++){
                if (arr[row][column] == target){
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
