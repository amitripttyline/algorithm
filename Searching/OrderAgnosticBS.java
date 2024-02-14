// BS works here for both ascending and descending sorted array
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {66,44,33,11,4};
        int target = 33;
        int index = AgnosticBS(arr, target);
        System.out.println(index);
    }
    static int AgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[end] > arr[start];
        while(start <= end){
            int mid = start + (end - start)/2; // finding the middle element, also might possible that (start + end ) exceeds the range so we took in fraction and all

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(arr[mid] > target){
                    end = mid - 1;
                } else if(arr[mid] < target) {
                    start = mid + 1;
                }
            } else {
                if(arr[mid] < target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
