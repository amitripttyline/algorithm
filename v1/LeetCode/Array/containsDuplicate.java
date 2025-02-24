// https://leetcode.com/problems/contains-duplicate/description/

package v1.LeetCode.Array;

import java.util.Arrays;

public class containsDuplicate {
    public boolean solution(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        for(int i=0;i < length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }

        }
        return false;
    }
}
