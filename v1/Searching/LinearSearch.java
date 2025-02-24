// Linear Search
package v1.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int target = 14;
        int[] nums = {22,44,33,22,14,33,44};
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }
    public static int linearsearch(int [] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
