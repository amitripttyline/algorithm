import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,4888,4,222,1111};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1 );
                } else {
                    break;
                }
            }
        }
    }


    static void swap(int[] arr, int maxIndex, int end){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[end];
        arr[end] = temp;
    }
}
