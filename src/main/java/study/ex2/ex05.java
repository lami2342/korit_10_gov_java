package study.ex2;

import java.util.Arrays;

public class ex05 {
    public static void main(String[] args) {
        int nums[][] = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };


        for (int i = 0; i < nums.length; i++) {
            int rowSums = 0;
            for (int j = 0; j < nums[i].length; j++) {
                rowSums += nums[i][j];

            }
            System.out.println("행 합계: " + rowSums);
        }
    }
}
