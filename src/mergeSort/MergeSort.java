package mergeSort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1, 3, 2, 4};
		
		breakDown(nums, nums.length);
		for (int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
	}
	
	public static void breakDown(int[] nums, int n) {
		if (n < 2) {
			return;
		}
		
		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];
		
		for (int i = 0; i < mid; i++) {
			left[i] = nums[i];
		}
		
		for (int i = mid; i < n; i++) {
			right[i-mid] = nums[i];
		}
		
		breakDown(left, mid);
		breakDown(right, n-mid);
		
		merge(nums, left, right, mid, n - mid);
	}
	
	public static void merge(
			int[] a, int[] leftArray, int[] rightArray, int leftLength, int rightLength) {
		int i = 0, j = 0, k = 0;
		
		while(i < leftLength && j < rightLength) {
			if (leftArray[i] <= rightArray[j]) {
				a[k++] = leftArray[i++];
			} else {
				a[k++] = rightArray[j++];
			}
		}

		while(i < leftLength) {
			a[k++] = leftArray[i++];
		}
		
		while(j < rightLength) {
			a[k++] = rightArray[j++];
		}
	}
}