package longestAlternatingSubArray;


public class LongestAlternatingSubArray {

	public static void main(String[] args) {
		int[] nums = {2, 3, 4, 3, 4};
		System.out.println(alternatingSubarray(nums));

	}
	
	public static int alternatingSubarray(int[] nums) {
		int longestSubarray = 0;
		int currentSubarray = 0;
		int prev;
		int curr;
		int next;
		
		for (int i = 0; i < nums.length; i++) {
			try {
				prev = nums[i-1];
			} catch(Exception e) {
				prev = -1;
			}

			try {
				curr = nums[i];
			} catch(Exception e) {
				curr = -1;
			}
			
			try {
				next = nums[i + 1];
			} catch(Exception e) {
				next = -1;
			}
			
				
			if (prev == next) {
				currentSubarray += 1;
			} else if (curr+1 == next) {
				if (currentSubarray > 1) {
					currentSubarray = 0;
				} else {
					currentSubarray += 1;
				}
			} else {
				currentSubarray = 0;
			}
				
			if (currentSubarray > longestSubarray) {
				longestSubarray = currentSubarray;
			}
		}
		
		if (longestSubarray > 0)
			return longestSubarray;
		
		return -1;
	}
}
