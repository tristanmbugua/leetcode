package majorityElement;

import java.util.*;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {1, 2, 2, 2, 5};
		
		System.out.println(majorityElement(nums));
	}
	
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) != null) {
				map.put(nums[i], map.get(nums[i])+1);
			} else {
				map.put(nums[i], 1);
			}
			
			if (map.get(nums[i]) > nums.length/2) {
				return nums[i];
			}
		}
		
		return nums[0];
    }
}