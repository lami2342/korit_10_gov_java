package study.ex2;

import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        int[][] nums = new int[3][3];
        int[] rowSums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int num = (j + 1) * 10;
                nums[i][j] = num + (i* nums[i].length)*10;

            }

            System.out.println(Arrays.toString(nums[i]));




        }
    }
}
