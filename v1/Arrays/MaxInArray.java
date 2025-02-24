package v1.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,63,2,69};
        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 2, 5));
    }

    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }
        return max;
    }

    static int maxInRange(int[] arr, int index1, int index2){
        //work on edge cases while array being null
        if(index2 > index1){
            return -1;
        }

        if(arr == null){
            return -1;
        }


        int max = arr[index1];
        for(int i=index1; i<= index2;i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }
        return max;
    }


}
