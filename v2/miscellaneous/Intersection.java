import java.util.ArrayList;
import java.util.List;

class Intersection {
    public static List<Integer> inter(int arr1[], int arr2[]){
        List<Integer> nums = new ArrayList<>();

        int i = 0;
        int j =0;
        while(i < arr1.length &&  j < arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            } else if(arr1[i] > arr2[j]){
                j++;
            } else{
                nums.add(arr1[i]);
                i++;
                j++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr1[] = {2,4,6,8,10};
        int arr2[] = {3,5,6,7,9,10};
        List<Integer> arr = inter(arr1, arr2);
        System.out.println(arr);
    }
}