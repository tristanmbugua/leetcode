package searchInsert;

public class searchInsert {

	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(searchInsert(nums, 1));
	}
	
	public static int searchInsert(int[] nums, int target) {
		int p2;
		
		if (nums.length < 1) {
			if (nums[0] < target) {
				return 1;
			} else {
				return 0;
			}
		}
		
		if (nums[0] > target) {
			return 0;
		}
		
		for (int i = 0; i < nums.length-1; i++) {
			p2 = i+1;
			
			if (nums[i] == target) {
				return i;	
			}
			
			if (nums[i] < target && nums[p2] > target) {
				return i+1;
			}
		}
		
		
		return nums.length;
	}
}