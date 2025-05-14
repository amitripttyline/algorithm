package v3.Arrays;

public class BinarySearch {
    public static int bSearch(int arr[], int k){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end -start)/2;
            if(arr[mid] == k){
                return mid;
            } else if (arr[mid] < k){
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr1[] = {2,4,6,8,10};
        int k = 8;
        System.out.println("index of seach element is: " + bSearch(arr1, k));
    }
    
}
