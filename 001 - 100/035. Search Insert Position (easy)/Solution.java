package leetcode;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        // O(n) solution.
        // int p;
        // for(p=0; p<nums.length; p++){
        //     if(nums[p] >= target){
        //         return p;
        //     }
        // }
        // return p;
        
        // use binary search library, O(log n) solution.
	// p = Arrays.binarySearch(nums, target);
	// if(p<0){
	// p = -1 - p;
	// }
		
	// binary search, O(log n) solution
	int low = 0, high = nums.length-1, mid=0;
	while(high-low>1){
		mid = (high + low)/2;
		if(nums[mid]==target){
			return mid;
		}else if(nums[mid]<target){
			low = mid;
		}else if(nums[mid]>target){
			high = mid;
		}
	}

	if(nums[high]<target){
		return high+1;
	}else if(nums[low]<target){
		return high;
	}else{
		return low;
	}
    }
}
