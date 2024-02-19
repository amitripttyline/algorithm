import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {2,4,3,1,5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i =0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct );
            } else {
                i++;
            }
        }
    }
    
    static void swap(int[] arr, int maxIndex, int end){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[end];
        arr[end] = temp;
    }
}
