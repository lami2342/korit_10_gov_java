package study.ch21;

public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("오류: "+e.getMessage());
        }
        System.out.println("프로그램 계속!");

    }
}
