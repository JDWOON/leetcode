package leetcode;

import java.util.Arrays;

public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=2){
            if(i==nums.length-1){
                return nums[i];
            }else if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}