package productOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		System.out.println(productExceptSelf(nums));
	}
	
	public static int[] productExceptSelf(int[] nums) {
        int total = 1;
		boolean zeroValue = false;
        
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
					zeroValue = true;
					continue;
			}
			total *= nums[i];
		}
		
        //Gather total
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = total;
				continue;
			} else if (zeroValue) {
				nums[i] = 0;
				continue;
			}
			nums[i] = total / nums[i];
		}
		
		return nums;
    }
}