package study.ch10;

public class array04 {
    public static void main(String[] args) {
        int[] nums ={10, 20, 30, 40};

        System.out.println("배열의 크기: " + nums.length);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //새로운 nums2배열을 비어있는 크기 4로 생성
        //nums에 있는 값들을 각 인뎃그에 맞게 10씩 곱하여 대입후 전체 출력

        int[] nums2 = new int[4];
        for (int i = 0;i<nums.length;i++) {
            nums2[i] = nums[i]*10;
        }

        for (int i = 0; i<nums2.length;i++){
            System.out.println(nums2[i]);
        }

        System.out.println("프로그램 정상 종료");




    }
}
