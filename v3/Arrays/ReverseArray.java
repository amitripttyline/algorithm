package v3.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArr(int arr[]){
        int i =0;
        int j = arr.length - 1;
        while(i< j){
            int temp  = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

        return arr;

    }
    public static void main(String[] args) {

        int arr[] = {2,5,7,22,4};
        System.out.println("Reversed array is: " + Arrays.toString(reverseArr(arr)));
        
    }
    
}
