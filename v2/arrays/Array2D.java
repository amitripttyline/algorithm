package v2.arrays;

import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {
        //Step 1: Declare
        int arrInt2d[][];
        //Step 2: Initiate
        arrInt2d = new int[2][3];
        //Step 3: Initialised
        arrInt2d[0][0] = 1;
        arrInt2d[0][1] = 2;
        arrInt2d[0][2] = 3;
        arrInt2d[1][0] = 4;
        arrInt2d[1][1] = 5;
        arrInt2d[1][2] = 6;

        System.out.println(Arrays.deepToString(arrInt2d));
        // all together
        String str2dArr[][] = { {"a", "b", "c"}, {"d", "e", "f"}  };
        System.out.println(Arrays.deepToString(str2dArr));
    }
}
