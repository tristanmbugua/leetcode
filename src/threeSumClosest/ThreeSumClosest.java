package threeSumClosest;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] nums = {-1, 2, 1, -4};
		System.out.println(threeSumClosest(nums, 1));
	}
	
	public static int threeSumClosest(int[] nums, int target) {
		int currentSum;
		int currentDistance;
		int closestSum = nums[0] + nums[1] + nums[2];
		int closestDistance = target - closestSum;
		
		for (int i = 1; i < nums.length-1; i++) {
			currentSum = nums[i-1] + nums[i] + nums[i+1];
			currentDistance = target - currentSum;
			
			if(currentDistance < closestDistance)
				closestSum = currentSum;
		}

		return closestSum;
    }
}