import java.util.Arrays;

public class RunningSum {

    public static int[] runSum(int arr[]){
        int sum = 0;
        int nums[] = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
            nums[i] = sum;
        }
        return nums;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(runSum(arr)));
    }
    
}
