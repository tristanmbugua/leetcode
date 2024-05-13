package largestPositiveIntegerThatExistsWithItsNegative;

import java.util.*;

public class LargestPositiveIntegerThatExistsWithItsNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, -3};
		System.out.println(findMaxK(nums));
	}
	
	public static int findMaxK(int[] nums) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
		int highestNumber = -1;
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			//If the number in the array is negative
			if (num < 0) {
				//Run the operation here.
				for (int j = 0; j < nums.length; j++) {
					if (nums[j] == (-1*num)) {
						if (nums[j] > highestNumber) {
							highestNumber = nums[j];
						}
					}
				}
//				//If the negative number does not exist in the array
//				if (list.indexOf(num) == -1) {
//					list.add(num);
//				} else {
//					continue;
//				}
			} 
		}
//		for (int i = 0; i < nums.length; i++) {
//			int num = nums[i];
//			//If the number in the array is positive
//			if (num > 0){
//				//Check if the negative pair has been initialized.
//					if (list.indexOf((-1)*num) > -1) {
//						if (num > highestNumber) {
//							highestNumber = num;
//						} else {
//							continue;
//						}
//					} else {
//						continue;
//					}
//				
//			}
//		}
		
		return highestNumber;
    }
}