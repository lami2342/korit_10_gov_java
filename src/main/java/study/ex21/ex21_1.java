package study.ex21;

public class ex21_1 {
    static void main() {

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);

        }catch (Exception e){
            System.out.println("에러발생");
        }
        System.out.println("프로그램 종료");

    }

}
