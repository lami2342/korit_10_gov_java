package study.ch08;

public class OBJ01 {
    public static void main(String[] args) {
        /**
         * 학생정보 100개 저장 필요
         * 이름,나이,학년,주소,연락처
         */
        class 학생 {
            String 이름;
            int 나이;

            void printInfo() {
                System.out.println("name: " + 이름);
                System.out.println("age: " + 나이);
            }

            void increaseAge() {
                System.out.println("나이 한살 더 먹기");
                나이++;
            }
        }

        학생 학생1 =new 학생();
        학생1.이름 = "신정수";
        학생1.나이 = 23;
        학생1.printInfo();
        학생1.increaseAge();
        학생1.printInfo();

        학생 학생2 = new 학생();
        학생2.이름 = "헌정수";
        학생2.나이 = 22;
        학생2.printInfo();
        학생2.increaseAge();
        학생2.printInfo();

    }
}
