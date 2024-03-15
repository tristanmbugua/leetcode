package binarySubarraysWithSum;

public class BinarySubarraysWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int numSubarraysWithSum(int[] nums, int goal) {
        int total = 0;
        int currentSum = 0;
        
        for (int startPoint = 0; startPoint < nums.length; startPoint++) {
        	for (int j = startPoint; j < nums.length; j++) {
        		currentSum += nums[j];
        	}
        	if (currentSum == goal)
        		total++;
        }
        return total;
    }
}