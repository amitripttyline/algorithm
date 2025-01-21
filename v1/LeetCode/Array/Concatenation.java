//https://leetcode.com/problems/concatenation-of-array/

class Concatenation{
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        // [1,2,3], 3=length
        int new_arr[] = new int[2*length];
        for(int i=0; i<length; i++){
            new_arr[i] = nums[i];
        }
        for (int i =0; i< length; i++){
            new_arr[i + length] = nums[i];
        }

        return new_arr;
    }
    
}