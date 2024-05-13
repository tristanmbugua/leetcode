package firstMissingPositive;

public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] nums = {1, 2, 0};
		System.out.println(firstMissingPositive(nums));
	}
	
	public static int firstMissingPositive(int[] nums) {
		int returnVal = 1;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == returnVal)
				returnVal = nums[i] + 1;
		}
		
		return returnVal;
    }
}