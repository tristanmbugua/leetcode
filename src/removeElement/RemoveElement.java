package removeElement;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 3}, 5));
    }

    public static int removeElement(int[] nums, int val) {
        //Two-pointer solution.
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            //When both pointers move, a valid value is safely set the front of the list.
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}