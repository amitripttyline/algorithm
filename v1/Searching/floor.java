package v1.Searching;
public class floor {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,9,33,55};
        int target = 10;
        int index = floorbs(arr, target);
        System.out.println(index);
    }
    // return the index of greatest number <=  target(niche wala)

    static int floorbs(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2; // finding the middle element, also might possible that (start + end ) exceeds the range so we took in fraction and all
            if(arr[mid] > target){
                end = mid - 1;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
