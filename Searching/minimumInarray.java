// Find minimum in array
public class minimumInarray {
    public static void main(String[] args) {
        int[] arr = {2,5,3,2,4,1,333,22,-33, 99,88};
        int min = minarray(arr);
        System.out.println(min);
    }
    static int minarray(int[] arr){
        int min = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
