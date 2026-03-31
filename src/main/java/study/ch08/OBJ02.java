package study.ch08;

public class OBJ02 {
    public static void main(String[] args) {
        class addition {
            int defaultNumber = 10;

            int add(int a , int b) {
                System.out.println("변수a : " + a);
                System.out.println("변수 b : " + b);
                System.out.println("기본값 : " + defaultNumber);
                return a + b + defaultNumber;
            }
        }

        addition add1 = new addition();
        int num = 1000;
        int num2= add1.add(100,200);
        System.out.println(num + num2);
    }
}
