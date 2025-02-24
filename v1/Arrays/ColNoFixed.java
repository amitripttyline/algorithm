package v1.Arrays;

import java.util.Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

//        for(int i = 0; i < arr.length; i++){

//            System.out.println(Arrays.toString(arr[i]));
//
//        }

        for(int row = 0; row < arr.length; row++){
            for(int col =0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();

        }


    }
}
