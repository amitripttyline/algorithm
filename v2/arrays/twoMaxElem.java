package v2.arrays;

import java.util.Arrays;

public class twoMaxElem {

    public static void main(String[] args) {
        int myArray[] = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScores(myArray)));
        
    }

    public static int[] findTopTwoScores(int[] array){
        // m1
        int max1 = Integer.MIN_VALUE;
        for(int num: array){
            if(num > max1){
                max1 = num;
            }
        }
        
        int max2 = Integer.MIN_VALUE;
        for(int num: array){
            if(num != max1){
                if(num > max2){
                    max2 = num;
                }
            }
        }
        
        int arrMax[] = new int[2];
        arrMax[0] = max1;
        arrMax[1] = max2;
        
        return arrMax;
      }

      // m2

    //   int firstHighest = Integer.MIN_VALUE;
    //   int secondHighest = Integer.MIN_VALUE;

    //   for (int score : array) {
    //       if (score > firstHighest) {
    //           secondHighest = firstHighest;
    //           firstHighest = score;
    //       } else if (score > secondHighest && score < firstHighest) {
    //           secondHighest = score;
    //       }
    //   }

    //   return new int[]{firstHighest, secondHighest};
    
}



