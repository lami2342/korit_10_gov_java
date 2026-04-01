package study.ch10;

public class array05 {
    public static void main(String[] args) {
        // 구구단을 배열에 시작 단 부터 끝단까지 자동으로 저장하여 출력하는 프로그램을
        // 작성하시오
        int danStart = 2;
        int danEnd = 9;

        int size = danEnd - danStart + 1;
        int[][] result = new int[size][9];

        for (int i = 0;i < result.length; i++){
            int dan = i + danStart;
            for (int j = 0; j< result[i].length; j++){
                int num = j + 1;
                result[i][j] = dan * num;
            }
        }

        for (int i = 0;i <result.length;i++){

            System.out.println(danStart + i + "단");

            System.out.print("[ ");
            for (int j = 0;j < result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("]");
        }

    }
}
