package v3.Arrays;

import java.util.Arrays;

public class MaxMinValue {
    public static int[] minMax(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int nums: arr){
            if(nums> max){
                max = nums;
            }
            if(nums< min){
                min = nums;
            }
        }
        int x[] = new int[2];
        x[0] = min;
        x[1] = max;
        return x;

    }
    public static void main(String[] args) {
        int arr[] = {2,4,65,6,1,66,9};
        System.out.println(Arrays.toString(minMax(arr)));
        
    }
    
    
}
