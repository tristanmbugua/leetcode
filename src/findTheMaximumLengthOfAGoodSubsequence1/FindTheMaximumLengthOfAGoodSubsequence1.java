package findTheMaximumLengthOfAGoodSubsequence1;

public class FindTheMaximumLengthOfAGoodSubsequence1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3};

        System.out.println(maximumLength(nums, 2));
    }

    public static int maximumLength(int[] nums, int k) {
        //Two-pointer solution.
        int len = nums.length;
        int maxCount = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[i+1]) {
                maxCount++;
            }

            if (maxCount == k) {
                return k;
            }
        }

        return maxCount;
   }
}