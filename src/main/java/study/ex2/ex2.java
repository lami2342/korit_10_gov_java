package study.ex2;

public class ex2 {
    public static void main(String[] args) {
        int[] nums = {39, 50, 32, 49, 100};
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0){
                max =nums[i];
                continue;
            }
            if (nums[i] > max) {
                max= nums[i];
            }
        }
        System.out.println("최댓값: " + max);
    }
}
