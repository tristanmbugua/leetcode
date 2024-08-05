package makeTwoArraysEqualByReversingSubarrays;

import java.util.Arrays;

public class MakeTwoArraysEqualByReversingSubarrays {

    public static void main(String[] args) {
        System.out.println(canBeEqual(new int[]{1, 2, 3, 4}, new int[]{4, 1, 2, 3}));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        //Sort both arrays. Their order is unimportant.
        Arrays.sort(arr);
        Arrays.sort(target);

        //Iterate over their
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }

        return true;
    }
}