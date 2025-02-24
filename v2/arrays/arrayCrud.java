package v2.arrays;

import java.util.Arrays;

public class arrayCrud {

    public static String search(int[] arr, int target){
        try{
            for(int i=0; i < arr.length; i++){
                if(arr[i] == target){
                    return "The element found at:" + i +"th index";
                } 
            }
            return "The element not found.";
        } catch(Exception e){
            return " Error ";
        }     
    }

    public static void update(int[] arr, int index, int element){
        arr[index] = element;
    }

    public static void delete(int[] arr, int index){
        arr[index] = Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,30,35,353,555};
        update(arr, 1, 3);
        delete(arr, 1);
        System.out.println(search(arr,555));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
    }
    
}
