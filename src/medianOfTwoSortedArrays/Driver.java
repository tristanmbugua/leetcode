package medianOfTwoSortedArrays;

/**
 * Problem:
 * <pre>
 * Problem Name: Median of Two Sorted Arrays 
 * Problem Difficulty: Hard
 * </pre>
 * Solution Stats:
 * <pre>
 * Runtime: 2ms
 * Runtime Rank: Beats 65.62% of users with Java 
 * Memory: 45.90MB
 * Memory Rank: Beats 70.70% of users with Java
 * </pre>
 * @version Date: March 9th 2024
 * @author Tristan Mbugua
 */
public class Driver {
	public static void main(String[] args) {
		int[] nums1 = {1, 3};
		int[] nums2 = {2};
		System.out.println(medianOfTwoSortedArrays(nums1, nums2));
	}
	
	public static double medianOfTwoSortedArrays(int[] nums1, int[] nums2) {
		int[] nums3 = new int[nums1.length + nums2.length];
		int num1 = 0;
		int num2 = 0;
		int[] holder = new int[nums1.length + nums2.length];
		for (int i = 0; i < nums3.length; i++) {
			if (num2 < nums2.length && num1 < nums1.length  && nums2[num2] > nums1[num1]) {
				nums3[i] = nums1[num1];
				num1++;
			} else if (num2 < nums2.length && num1 < nums1.length  && nums2[num2] < nums1[num1]) {
				nums3[i] = nums2[num2];
				num2++;
				
			} else if (num2 < nums2.length && num1 <= nums1.length){ 
				nums3[i] = nums2[num2];
				num2++;
			}  else { 
				nums3[i] = nums1[num1];
				num1++;
			}
		}
		
		if (nums3.length % 2 == 0) {
			return (((double)nums3[(nums3.length/2)] + (double)nums3[(nums3.length/2 - 1)])/ 2.0);
		} else {
			return (double)nums3[(nums3.length/2)];
		}
	}
}