package v3.Arrays.SubArrays;

public class MaxSubarraysKadanesAlgo_III {

    public static void kadane(int arr[]){
        // if all no is negative check and return the smallest -ve no
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int num: arr){
            cs += num;
            if(cs< 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max sum : " + ms);

    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2, 1,5,-3};
        kadane(arr);

    }
    
}
