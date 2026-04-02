package study.ex2;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        int[][] nums = new int[3][3];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length - i - 1; j++) {
                int num = j + 1;
                nums[i][j] = num + (i * nums[i].length);

            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }

    }
}
