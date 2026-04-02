package study.ex2;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] nums2 = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums2[nums.length - 1 - i] = nums[i];

        }

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[nums.length - 1 - i] = nums[i];
            nums[nums.length - 1 - i] = temp;

            System.out.println(Arrays.toString(nums));
        }

    }
}
