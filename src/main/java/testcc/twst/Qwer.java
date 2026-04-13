package testcc.twst;

class Student implements Comparable<Student> {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor  = kor;
        this.eng  = eng;
        this.math = math;
    }

    // Getter
    public String getName() { return name; }
    public int getKor()     { return kor; }
    public int getEng()     { return eng; }
    public int getMath()    { return math; }

    public int getTotal() {
        return kor + eng + math;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    // 평균 기준 내림차순 정렬 (Comparable)
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.getAverage(), this.getAverage());
    }

    @Override
    public String toString() {
        return String.format("%-10s | 국어: %3d | 영어: %3d | 수학: %3d | 총점: %3d | 평균: %6.2f",
                name, kor, eng, math, getTotal(), (double)getAverage());
    }
}

public class Qwer {
}
