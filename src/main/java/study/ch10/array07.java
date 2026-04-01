package study.ch10;

import java.util.Random;

public class array07 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random random =new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100) + 1;

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ((i < nums.length-1)?", ":""));
        }
        
        //nums에 저장된 랜덤한 숫자 중 최대값과 최소값을 각각 구하시오.
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0){
                max = nums[i];
                min = nums[i];
                continue;
            }
            max = nums[i] > max ? nums[i] : max;
            // 간단한 연산으로 처리 가능하기에
            // 삼항 연산자로 처리하는것이 편하다
            min = nums[i] < min ? nums[i] : min;

            int num = nums[i];
        }
        System.out.println();
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
