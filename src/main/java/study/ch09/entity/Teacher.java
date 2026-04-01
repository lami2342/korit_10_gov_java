package study.ch09.entity;

public class Teacher {
    private String name;
    private int age;
    private int 월급;

    private Teacher() {}

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        this.월급 = 1000000;
    }

    private String printInfo() {
        System.out.println("선생님 이름: " + name);
        System.out.println("선생님 나이: " + age);
        return null;
    }

    private void 월급계산(int 세전월급){
        this.월급 = (int) (세전월급-세전월급 * 0.1);
    }
}