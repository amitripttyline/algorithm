package v1.sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,4888,4,222,1111};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            // find the max item in the remaining array and swap with correct index
            int end = arr.length-i-1;
            int start =0;
            int maxIndex = largest(arr, start, end);
            swap(arr, maxIndex, end);

        }

    }

    static int largest(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i < end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int maxIndex, int end){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[end];
        arr[end] = temp;
    }
}
