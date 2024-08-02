package twoSum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{-1,-2,-3,-4,-5}, -8));
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0, 1};
        int[] copyArr = nums.clone();

        Arrays.sort(copyArr);

        //Edge case one: List only has one option.
        if (nums.length < 3) {
            return result;
        }

        //Two pointer
        for (int i = 0; i < copyArr.length; i++) {
            for (int j = i+1; j < copyArr.length; j++) {
                if (copyArr[i] + copyArr[j] == target) {
                    result[0] = copyArr[i];
                    result[1] = copyArr[j];
                    return helper(copyArr, nums, result);
                }
            }
        }

        return result;
    }

    public static int[] helper(int[] copyArr, int[] nums, int[] result) {
        //Find position one
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == result[0]) {
                result[0] = i;
                break;
            }
        }

        //Find position two
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == result[1] && i != result[0]) {
                result[1] = i;
                break;
            }
        }

        return result;
    }
}