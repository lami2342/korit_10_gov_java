package study.ch10;

public class array02{
    public static void main(String[] args) {
        int[] iArr = {1, 2, 3, 4, 5};
        char[] cArr = {'a', 'b', 'c'};
        boolean[] bArr = {true, false, true, false};
        double[] dArr = {1.0, 3.14, 5.5};
        String[] sArr = {"신동수", "신정수", "헌정수"};

        class Student {
            private String name;

            Student() {}

            Student(String name) {
                this.name = name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        Student[] students = {
                new Student("신동수"),
                new Student("헌동수"),
                new Student("헌정수")
        };

        Student[] students2 ={ new Student(), new Student(), new Student()};
        students2[0].setName("신정수");
        students2[1].setName("신훈수");
        students2[2].setName("신푼수");
    }

}
