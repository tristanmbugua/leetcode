package moveZeroes;

public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{2, 1});
    }

    public static void moveZeroes(int[] nums) {
        //Two pointer from the start;
        int j = 0;
        int swap = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap = nums[i];
                nums[i] = nums[j];
                nums[j] = swap;
                j++;
            }
        }
    }
}