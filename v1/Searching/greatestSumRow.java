package v1.Searching;

public class greatestSumRow {
    public static void main(String[] args) {
        int[][] arr = {
                {22,44,55},
                {44,55,55,11},
                {1,4,5}
        };
        int max = maxrow(arr);
        System.out.println(max);
    }

    static int maxrow(int[][] arr){
        int rowsum = 0;
        for(int row = 0; row < arr.length; row++){
            int sumrow = 0;
            for (int col=0; col < arr[row].length; col++){
                sumrow += arr[row][col];
            }
            if(sumrow > rowsum){
                rowsum = sumrow;
            }
            return rowsum;
        }
        return -1;
    }
}
