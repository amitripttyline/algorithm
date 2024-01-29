import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,5,6,4,7,3};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index3){
        int temp = arr[index1];
        arr[index1] = arr[index3];
        arr[index3] = temp;

    }
}
