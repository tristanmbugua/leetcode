package removeDuplicatesFromSortedArray;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }

    public static int removeDuplicates(int[] nums) {
        //Two-Pointer Solution
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++;
            }
        }

        return i+1;
    }
}