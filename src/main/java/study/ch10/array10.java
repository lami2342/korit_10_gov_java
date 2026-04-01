package study.ch10;

public class array10 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        for (int i = 0; i < nums.length; i++) {
            int num =nums[i];
            System.out.println(num);
        }

        for (int num : nums) {
            System.out.println(num);
        }

        String[] names = {"신동수", "신정수", "헌정수"};

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);

        }

        for (String name : names){
            System.out.println(name);
        }
    }
}
