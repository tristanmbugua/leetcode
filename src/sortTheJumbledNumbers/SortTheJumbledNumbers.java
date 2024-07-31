package sortTheJumbledNumbers;

import java.util.*;

public class SortTheJumbledNumbers {

    public static void main(String[] args) {
        int[] mapping = {9,8,7,6,5,4,3,2,1,0};
        int[] nums = {0,1,2,3,4,5,6,7,8,9};


        sortJumbled(mapping, nums);
//        System.out.print("Test!");
    }
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        //Core Idea: Pull the numbers, reverse them later.
        int[] returnArr = new int[nums.length];

        int[] mappingCopy = nums.clone();

        //Pull the numbers in reverse order.
        for (int i = 0; i < returnArr.length; i++) {
            if (nums[i] == 0) {
                returnArr[i] *= 10;
                returnArr[i] += (mapping[nums[i]%10] % 10);
            } else  {
                while (nums[i] > 0) {
                    returnArr[i] *= 10;
                    returnArr[i] += (mapping[nums[i]%10] % 10);
                    nums[i] /= 10;
                }
            }

        }

        //Use a 2D array to organize.
        int[][] twoD = new int[nums.length][2];

        for (int i = 0; i < returnArr.length; i++) {
            twoD[i][1] = mappingCopy[i];
            twoD[i][0] = Integer.parseInt(new StringBuilder(String.valueOf(returnArr[i])).reverse().toString());
        }

        Arrays.sort(
                twoD,
                (a, b) -> Integer.compare(a[0], b[0])
        );

        for (int i = 0; i < returnArr.length; i++) {
            returnArr[i] = twoD[i][1];
        }

        System.out.println(Arrays.toString(returnArr));

        return returnArr;
    }
}