package v3.Arrays;



public class LinearSearch {
    public static int search(int arr1[], int k){
        for(int i = 0; i< arr1.length; i++){
            if(arr1[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[] = {2,4,6,8,10};
        int k = 8;
        System.out.println("index of seach element is: " + search(arr1, k));
    }
}


